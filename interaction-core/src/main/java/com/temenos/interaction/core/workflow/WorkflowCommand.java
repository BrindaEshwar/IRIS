package com.temenos.interaction.core.workflow;

/*
 * #%L
 * interaction-core
 * %%
 * Copyright (C) 2012 - 2017 Temenos Holdings N.V.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */


import com.temenos.interaction.core.command.InteractionCommand;
import com.temenos.interaction.core.command.TransitionCommand;


/**
 * An {@link InteractionCommand} that orchestrates a workflow
 * of command execution.
 *
 * @author ikarady
 */
public interface WorkflowCommand extends InteractionCommand {

    /**
     * Type of execution performed.
     */
    enum ExecutionType {
        /**
         * Represents the case when the last executed {@link InteractionCommand}
         * was not a {@link TransitionCommand}.
         */
        INTERACTION,
        /**
         * Represents the case when the last executed {@link InteractionCommand}
         * was a {@link TransitionCommand}.
         */
        TRANSITION
    }

    /**
     * Returns true if there are no {@link InteractionCommand}s in workflow.
     *
     * @return true or false
     */
    public boolean isEmpty();

    /**
     * Returns the type of execution performed depending on
     * whether the last {@link InteractionCommand} executed
     * was a {@link TransitionCommand}.
     *
     * @return {@link ExecutionType} the type of execution result.
     */
    public ExecutionType getExecutionType();

}
