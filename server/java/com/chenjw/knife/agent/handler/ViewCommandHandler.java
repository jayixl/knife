package com.chenjw.knife.agent.handler;

import java.io.IOException;

import com.chenjw.knife.agent.Agent;
import com.chenjw.knife.agent.CommandDispatcher;
import com.chenjw.knife.agent.CommandHandler;
import com.chenjw.knife.agent.args.ArgDef;
import com.chenjw.knife.agent.args.Args;
import com.chenjw.knife.agent.constants.Constants;
import com.chenjw.knife.agent.manager.ContextManager;

public class ViewCommandHandler implements CommandHandler {

	@Override
	public void handle(Args args, CommandDispatcher dispatcher)
			throws IOException {
		Object thisObject = ContextManager.getInstance().get(Constants.THIS);
		if (thisObject == null) {
			Agent.info("not found");
		} else {
			if (args.option("-c") != null) {
				Agent.info(thisObject.getClass().getClassLoader().getClass()
						.toString());
			}
			Agent.info("option not found");
		}

	}

	public void declareArgs(ArgDef argDef) {
		argDef.setCommandName("view");
		argDef.setDesc("trace an invocation on the target object.");
		argDef.setDef("[-c]");
		argDef.addOptionDesc("-c", "view classloader");
	}

}