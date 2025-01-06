package org.redgogh.cleantools.lang.test;

/* -------------------------------------------------------------------------------- *\
|*                                                                                  *|
|*    Copyright (C) 2019-2024 RedGogh All rights reserved.                          *|
|*                                                                                  *|
|*    Licensed under the Apache License, Version 2.0 (the "License");               *|
|*    you may not use this file except in compliance with the License.              *|
|*    You may obtain a copy of the License at                                       *|
|*                                                                                  *|
|*        http://www.apache.org/licenses/LICENSE-2.0                                *|
|*                                                                                  *|
|*    Unless required by applicable law or agreed to in writing, software           *|
|*    distributed under the License is distributed on an "AS IS" BASIS,             *|
|*    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.      *|
|*    See the License for the specific language governing permissions and           *|
|*    limitations under the License.                                                *|
|*                                                                                  *|
\* -------------------------------------------------------------------------------- */

import org.redgogh.cleantools.io.File;
import org.redgogh.cleantools.reflect.ObjectSerializer;
import org.junit.Test;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class ObjectSerializerTest {

    static class User implements Serializable {
        /* test field */
        private String name = "Crazy";

        public User(String name) {
            this.name = name;
        }

    }

    @Test
    public void serializeTest() {
        ObjectSerializer.serialize(new User("Judy"), new File("Desktop://judy.ser"));
    }

    @Test
    public void deserializeTest() {
        File file = new File("Desktop://judy.ser");
        User user = (User) ObjectSerializer.deserialize(file);
        System.out.println(user);
        file.forceDelete();
    }


}