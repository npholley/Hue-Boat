package com.nicholasholley.dev.hueboat.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

class HueScene(
        @PrimaryKey var id:     Long = 0L,
        @Expose var name:       String? = null,
        @Expose var type: String? = null,
        @Expose var owner: String? = null,
        @Expose var picture: String? = null,
        @Expose var lastupdated: String? = null,
        @Expose var recycle: Boolean? = false,
        @Expose var locked: Boolean? = null,
        @Expose var version: Int? = null,
        @SerializedName("lights")
        @Expose var lightIds: RealmList<Long> = RealmList(),
        var lights: RealmList<HueLight>
): RealmObject()