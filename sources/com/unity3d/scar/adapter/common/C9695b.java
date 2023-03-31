package com.unity3d.scar.adapter.common;

import p389wa.C12939c;

/* renamed from: com.unity3d.scar.adapter.common.b */
/* compiled from: GMAAdsError */
public class C9695b extends C9706l {
    public C9695b(C9696c cVar, Object... objArr) {
        super(cVar, (String) null, objArr);
    }

    /* renamed from: a */
    public static C9695b m50612a(C12939c cVar) {
        String format = String.format("Cannot show ad that is not loaded for placement %s", new Object[]{cVar.mo37980c()});
        return new C9695b(C9696c.AD_NOT_LOADED_ERROR, format, cVar.mo37980c(), cVar.mo37981d(), format);
    }

    /* renamed from: b */
    public static C9695b m50613b(String str) {
        return new C9695b(C9696c.SCAR_UNSUPPORTED, str, new Object[0]);
    }

    /* renamed from: c */
    public static C9695b m50614c(C12939c cVar, String str) {
        return new C9695b(C9696c.INTERNAL_LOAD_ERROR, str, cVar.mo37980c(), cVar.mo37981d(), str);
    }

    /* renamed from: d */
    public static C9695b m50615d(C12939c cVar, String str) {
        return new C9695b(C9696c.INTERNAL_SHOW_ERROR, str, cVar.mo37980c(), cVar.mo37981d(), str);
    }

    /* renamed from: e */
    public static C9695b m50616e(String str) {
        return new C9695b(C9696c.INTERNAL_SIGNALS_ERROR, str, str);
    }

    /* renamed from: f */
    public static C9695b m50617f(String str, String str2, String str3) {
        return new C9695b(C9696c.NO_AD_ERROR, str3, str, str2, str3);
    }

    /* renamed from: g */
    public static C9695b m50618g(C12939c cVar) {
        String format = String.format("Missing queryInfoMetadata for ad %s", new Object[]{cVar.mo37980c()});
        return new C9695b(C9696c.QUERY_NOT_FOUND_ERROR, format, cVar.mo37980c(), cVar.mo37981d(), format);
    }

    public String getDomain() {
        return "GMA";
    }

    public C9695b(C9696c cVar, String str, Object... objArr) {
        super(cVar, str, objArr);
    }
}
