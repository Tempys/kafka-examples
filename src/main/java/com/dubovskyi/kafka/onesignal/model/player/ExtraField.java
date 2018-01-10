/*
 * Copyright 2017 CurrencyFair Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dubovskyi.kafka.onesignal.model.player;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Extra field that can be included in the
 * {@link com.dubovskyi.kafka.onesignal.OneSignal#csvExportFileLocation(String, String, CsvExportFileLocationRequest)}
 * request.
 */
public enum ExtraField {

    //CHECKSTYLE:Off javadoc
    LOCATION("location"),
    ROOTED("rooted");
    //CHECKSTYLE:On javadoc

    private final String value;

    ExtraField(String value) {
        this.value = value;
    }

    @JsonCreator
    public static ExtraField fromValue(String value) {
        for (ExtraField extraField : ExtraField.values()) {
            if (extraField.value.equalsIgnoreCase(value)) {
                return extraField;
            }
        }
        return null;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
