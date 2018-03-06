/*
 * Copyright 2018 Hippo B.V. (http://www.onehippo.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *         http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onehippo.forge.pageflow.core.rt.impl;

import java.util.Objects;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.onehippo.forge.pageflow.core.rt.PageState;

public class DefaultPageState implements PageState {

    private static final long serialVersionUID = 1L;

    private final String id;

    private final String name;

    private final String path;

    private final int index;

    public DefaultPageState(final String id, final String name, final String path, final int index) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.index = index;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof DefaultPageState)) {
            return false;
        }

        DefaultPageState that = (DefaultPageState) o;

        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(path, that.path)
                && (index == that.index);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(name).append(path).append(index).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("path", path)
                .append("index", index).toString();
    }
}
