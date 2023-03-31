package p211d8;

import com.google.protobuf.C8234t1;
import p246h7.C10428q;
import p405y8.C13088b0;
import p405y8.C13161s;

/* renamed from: d8.v */
/* compiled from: ServerTimestamps */
public final class C9904v {
    /* renamed from: a */
    public static C8234t1 m50788a(C13088b0 b0Var) {
        return b0Var.mo38118t0().mo38229g0("__local_write_time__").mo38121w0();
    }

    /* renamed from: b */
    public static C13088b0 m50789b(C13088b0 b0Var) {
        C13088b0 f0 = b0Var.mo38118t0().mo38228f0("__previous_value__", (C13088b0) null);
        return m50790c(f0) ? m50789b(f0) : f0;
    }

    /* renamed from: c */
    public static boolean m50790c(C13088b0 b0Var) {
        C13088b0 b0Var2 = null;
        if (b0Var != null) {
            b0Var2 = b0Var.mo38118t0().mo38228f0("__type__", (C13088b0) null);
        }
        return b0Var2 != null && "server_timestamp".equals(b0Var2.mo38120v0());
    }

    /* renamed from: d */
    public static C13088b0 m50791d(C10428q qVar, C13088b0 b0Var) {
        C13161s.C13163b F = C13161s.m61758k0().mo38232F("__type__", (C13088b0) C13088b0.m61490y0().mo38135P("server_timestamp").build()).mo38232F("__local_write_time__", (C13088b0) C13088b0.m61490y0().mo38136Q(C8234t1.m45639g0().mo27293E(qVar.mo33499c()).mo27292D(qVar.mo33498b())).build());
        if (b0Var != null) {
            F.mo38232F("__previous_value__", b0Var);
        }
        return (C13088b0) C13088b0.m61490y0().mo38131L(F).build();
    }
}
