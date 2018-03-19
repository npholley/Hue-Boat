package com.nicholasholley.dev.hueboat.data.models

import com.google.gson.annotations.Expose
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

class HueUser(
        @PrimaryKey var id:         Long = 0,
        @Expose var username:       String? = null,
        @Expose var devicetype:     String? = null
): RealmObject()