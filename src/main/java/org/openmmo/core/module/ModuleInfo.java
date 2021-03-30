package org.openmmo.core.module;

public @interface ModuleInfo {

    String name();
    String version();
    String[] depends();

}
