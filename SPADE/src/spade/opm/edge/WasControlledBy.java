/*
--------------------------------------------------------------------------------
SPADE - Support for Provenance Auditing in Distributed Environments.
Copyright (C) 2011 SRI International

This program is free software: you can redistribute it and/or  
modify it under the terms of the GNU General Public License as  
published by the Free Software Foundation, either version 3 of the  
License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,  
but WITHOUT ANY WARRANTY; without even the implied warranty of  
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU  
General Public License for more details.

You should have received a copy of the GNU General Public License  
along with this program. If not, see <http://www.gnu.org/licenses/>.
--------------------------------------------------------------------------------
 */
package spade.opm.edge;

import spade.core.AbstractEdge;
import spade.opm.vertex.Agent;
import spade.opm.vertex.Process;
import java.util.LinkedHashMap;
import java.util.Map;

public class WasControlledBy extends AbstractEdge {

    public WasControlledBy(Process controlledProcess, Agent controllingAgent) {
        setSourceVertex(controlledProcess);
        setDestinationVertex(controllingAgent);
        annotations = new LinkedHashMap<String, String>();
        addAnnotation("type", "WasControlledBy");
    }

    public WasControlledBy(Process controlledProcess, Agent controllingAgent, Map<String, String> inputAnnotations) {
        setSourceVertex(controlledProcess);
        setDestinationVertex(controllingAgent);
        setAnnotations(inputAnnotations);
        addAnnotation("type", "WasControlledBy");
    }
}
