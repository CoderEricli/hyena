/*
 *  Copyright (C) 2019 Alpha Jiang. All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package io.github.alphajiang.hyena.utils;

public class NumberUtils {


    public static long parseLong(String val, long defaultValue) {
        long ret = defaultValue;
        try {
            ret = Long.parseLong(val);
        } catch (Exception ignored) {

        }
        return ret;
    }

    public static long parseLong(byte[] val, long defaultValue) {
        if (val == null) {
            return defaultValue;
        } else {
            return NumberUtils.parseLong(new String(val), defaultValue);
        }
    }


    public static boolean longEquals(Long va, Long vb) {
        if (va == null && vb == null) {
            return true;
        } else if (va == null || vb == null) {
            return false;
        } else return va.longValue() == vb.longValue();
    }
}
