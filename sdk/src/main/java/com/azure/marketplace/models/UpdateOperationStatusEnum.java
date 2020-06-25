// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.marketplace.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for UpdateOperationStatusEnum. */
public enum UpdateOperationStatusEnum {
    /** Enum value Success. */
    SUCCESS("Success"),

    /** Enum value Failure. */
    FAILURE("Failure");

    /** The actual serialized value for a UpdateOperationStatusEnum instance. */
    private final String value;

    UpdateOperationStatusEnum(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a UpdateOperationStatusEnum instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed UpdateOperationStatusEnum object, or null if unable to parse.
     */
    @JsonCreator
    public static UpdateOperationStatusEnum fromString(String value) {
        UpdateOperationStatusEnum[] items = UpdateOperationStatusEnum.values();
        for (UpdateOperationStatusEnum item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
