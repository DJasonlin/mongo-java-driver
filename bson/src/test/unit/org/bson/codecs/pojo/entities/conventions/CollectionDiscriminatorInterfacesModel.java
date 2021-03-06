/*
 * Copyright 2017 MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bson.codecs.pojo.entities.conventions;

import java.util.List;
import java.util.Map;

public class CollectionDiscriminatorInterfacesModel {
    private List<InterfaceModel> list;
    private Map<String, InterfaceModel> map;

    public List<InterfaceModel> getList() {
        return list;
    }

    public CollectionDiscriminatorInterfacesModel setList(final List<InterfaceModel> list) {
        this.list = list;
        return this;
    }

    public Map<String, InterfaceModel> getMap() {
        return map;
    }

    public CollectionDiscriminatorInterfacesModel setMap(final Map<String, InterfaceModel> map) {
        this.map = map;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CollectionDiscriminatorInterfacesModel that = (CollectionDiscriminatorInterfacesModel) o;

        if (getList() != null ? !getList().equals(that.getList()) : that.getList() != null) {
            return false;
        }
        return getMap() != null ? getMap().equals(that.getMap()) : that.getMap() == null;
    }

    @Override
    public int hashCode() {
        int result = getList() != null ? getList().hashCode() : 0;
        result = 31 * result + (getMap() != null ? getMap().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CollectionDiscriminatorModel{"
                + "list=" + list
                + ", map=" + map
                + '}';
    }
}
