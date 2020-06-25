// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.marketplace.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Plan model. */
@Fluent
public final class Plan {
    /*
     * The planId property.
     */
    @JsonProperty(value = "planId")
    private String planId;

    /*
     * The displayName property.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The isPrivate property.
     */
    @JsonProperty(value = "isPrivate")
    private Boolean isPrivate;

    /**
     * Get the planId property: The planId property.
     *
     * @return the planId value.
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * Set the planId property: The planId property.
     *
     * @param planId the planId value to set.
     * @return the Plan object itself.
     */
    public Plan setPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * Get the displayName property: The displayName property.
     *
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The displayName property.
     *
     * @param displayName the displayName value to set.
     * @return the Plan object itself.
     */
    public Plan setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the isPrivate property: The isPrivate property.
     *
     * @return the isPrivate value.
     */
    public Boolean isPrivate() {
        return this.isPrivate;
    }

    /**
     * Set the isPrivate property: The isPrivate property.
     *
     * @param isPrivate the isPrivate value to set.
     * @return the Plan object itself.
     */
    public Plan setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }
}
