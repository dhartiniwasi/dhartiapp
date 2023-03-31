package com.startapp;

import android.text.TextUtils;

/* renamed from: com.startapp.se */
/* compiled from: Sta */
public class C9542se {
    /* renamed from: a */
    public static void m50337a(C9267rd rdVar) {
        if (!rdVar.f38169f) {
            throw new IllegalStateException("AdSession is not started");
        } else if (rdVar.f38170g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: a */
    public static void m50338a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m50339a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m50340b(C9267rd rdVar) {
        if (rdVar.f38170g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m50341c(C9267rd rdVar) {
        if (!rdVar.mo29886d()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }
}
