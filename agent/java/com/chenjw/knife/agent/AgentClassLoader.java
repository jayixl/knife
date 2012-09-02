package com.chenjw.knife.agent;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;

public class AgentClassLoader extends URLClassLoader {
	private ClassLoader parent;

	public AgentClassLoader(URL[] urls, ClassLoader parent) {
		super(urls, null);
		this.parent = parent;
	}

	public void setParent(ClassLoader parent) {
		this.parent = parent;
	}

	@Override
	protected synchronized Class<?> loadClass(String s, boolean flag)
			throws ClassNotFoundException {
		Class<?> class1 = this.findLoadedClass(s);
		if (class1 == null) {
			try {
				if (parent != null)
					class1 = parent.loadClass(s);
			} catch (ClassNotFoundException classnotfoundexception) {
				// System.out.println("parent " + parent.getClass()
				// + " cant find class " + s);
			}
			if (class1 == null)
				class1 = findClass(s);
		}
		if (flag)
			resolveClass(class1);
		return class1;
	}

	@Override
	public String toString() {
		return "AgentClassLoader [parent=" + parent + ", getURLs()="
				+ Arrays.toString(getURLs()) + "]";
	}

}