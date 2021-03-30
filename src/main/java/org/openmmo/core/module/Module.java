package org.openmmo.core.module;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.openmmo.core.OpenMMOCore;

@Getter
@RequiredArgsConstructor
public abstract class Module {

    private final OpenMMOCore core;

    /**
     * will be called if the module gets loaded
     *
     * @return response if module successfully loaded
     */
    public abstract boolean onLoad();

    /**
     * will be called if the module gets enabled
     *
     * @return true if module enabled successfully
     */
    public abstract boolean onEnable();

    /**
     * will be called if the module gets disabled
     *
     * @return true if the module disables successfully
     */
    public abstract boolean onDisable();

    /**
     * @param moduleName name of the module
     * @param <M> Module Type
     * @return null if no module was found.
     */
    public <M> M getModule(String moduleName) {
        return null;
    }

}
