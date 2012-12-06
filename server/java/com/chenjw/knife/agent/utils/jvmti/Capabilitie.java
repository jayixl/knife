package com.chenjw.knife.agent.utils.jvmti;

public enum Capabilitie {
	can_tag_objects(1), //
	can_generate_field_modification_events(1), //
	can_generate_field_access_events(1), //
	can_get_bytecodes(1), //
	can_get_synthetic_attribute(1), //
	can_get_owned_monitor_info(1), //
	can_get_current_contended_monitor(1), //
	can_get_monitor_info(1), //
	can_pop_frame(1), //
	can_redefine_classes(1), //
	can_signal_thread(1), //
	can_get_source_file_name(1), //
	can_get_line_numbers(1), //
	can_get_source_debug_extension(1), //
	can_access_local_variables(1), //
	can_maintain_original_method_order(1), //
	can_generate_single_step_events(1), //
	can_generate_exception_events(1), //
	can_generate_frame_pop_events(1), //
	can_generate_breakpoint_events(1), //
	can_suspend(1), //
	can_redefine_any_class(1), //
	can_get_current_thread_cpu_time(1), //
	can_get_thread_cpu_time(1), //
	can_generate_method_entry_events(1), //
	can_generate_method_exit_events(1), //
	can_generate_all_class_hook_events(1), //
	can_generate_compiled_method_load_events(1), //
	can_generate_monitor_events(1), //
	can_generate_vm_object_alloc_events(1), //
	can_generate_native_method_bind_events(1), //
	can_generate_garbage_collection_events(1), //
	can_generate_object_free_events(1), //
	can_force_early_return(1), //
	can_get_owned_monitor_stack_depth_info(1), //
	can_get_constant_pool(1), //
	can_set_native_method_prefix(1), //
	can_retransform_classes(1), //
	can_retransform_any_class(1), //
	can_generate_resource_exhaustion_heap_events(1), //
	can_generate_resource_exhaustion_threads_events(1);

	private int index;

	private Capabilitie(int index) {
		this.index = index;
	}

	public int getIndex() {
		return this.index;
	}

}
