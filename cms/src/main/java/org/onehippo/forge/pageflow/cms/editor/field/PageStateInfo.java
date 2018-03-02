/*
 *  Copyright 2018 Hippo B.V. (http://www.onehippo.com)
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.onehippo.forge.pageflow.cms.editor.field;

import java.io.Serializable;
import java.util.Objects;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class PageStateInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String stateId;

    private String name;

    private String description;

    public PageStateInfo() {
    }

    public PageStateInfo(String stateId, String name, String description) {
        this.stateId = stateId;
        this.name = name;
        this.description = description;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PageStateInfo)) {
            return false;
        }

        PageStateInfo that = (PageStateInfo) o;
        return Objects.equals(stateId, that.stateId) && Objects.equals(name, that.name)
                && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stateId).append(name).append(description).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("stateId", stateId).append("name", name)
                .append("description", description).toString();
    }
}