package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C6872a5;
import com.google.android.gms.internal.measurement.C6889b5;
import com.google.android.gms.internal.measurement.C6906c5;
import com.google.android.gms.internal.measurement.C6989h3;
import com.google.android.gms.internal.measurement.C6991h5;
import com.google.android.gms.internal.measurement.C7016ie;
import com.google.android.gms.internal.measurement.C7021j3;
import com.google.android.gms.internal.measurement.C7023j5;
import com.google.android.gms.internal.measurement.C7039k5;
import com.google.android.gms.internal.measurement.C7055l5;
import com.google.android.gms.internal.measurement.C7076ma;
import com.google.android.gms.internal.measurement.C7086n4;
import com.google.android.gms.internal.measurement.C7101o3;
import com.google.android.gms.internal.measurement.C7118p4;
import com.google.android.gms.internal.measurement.C7133q3;
import com.google.android.gms.internal.measurement.C7134q4;
import com.google.android.gms.internal.measurement.C7139q9;
import com.google.android.gms.internal.measurement.C7150r4;
import com.google.android.gms.internal.measurement.C7186t8;
import com.google.android.gms.internal.measurement.C7198u4;
import com.google.android.gms.internal.measurement.C7213v3;
import com.google.android.gms.internal.measurement.C7214v4;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.internal.c9 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7325c9 extends C7478q8 {
    C7325c9(C7303a9 a9Var) {
        super(a9Var);
    }

    /* renamed from: C */
    static C7076ma m41387C(C7076ma maVar, byte[] bArr) throws C7139q9 {
        C7186t8 a = C7186t8.m40946a();
        if (a != null) {
            return maVar.mo23664H1(bArr, a);
        }
        return maVar.mo23663F0(bArr);
    }

    /* renamed from: H */
    static List m41388H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: L */
    static boolean m41389L(List list, int i) {
        if (i >= list.size() * 64) {
            return false;
        }
        return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
    }

    /* renamed from: N */
    static boolean m41390N(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: P */
    static final void m41391P(C7134q4 q4Var, String str, Object obj) {
        List H = q4Var.mo23755H();
        int i = 0;
        while (true) {
            if (i >= H.size()) {
                i = -1;
                break;
            } else if (str.equals(((C7214v4) H.get(i)).mo23949I())) {
                break;
            } else {
                i++;
            }
        }
        C7198u4 G = C7214v4.m41014G();
        G.mo23910B(str);
        if (obj instanceof Long) {
            G.mo23909A(((Long) obj).longValue());
        }
        if (i >= 0) {
            q4Var.mo23749B(i, G);
        } else {
            q4Var.mo23761v(G);
        }
    }

    /* renamed from: k */
    static final boolean m41392k(C7524v vVar, C7446n9 n9Var) {
        C4141r.m28221k(vVar);
        C4141r.m28221k(n9Var);
        return !TextUtils.isEmpty(n9Var.f32788b) || !TextUtils.isEmpty(n9Var.f32803y);
    }

    /* renamed from: m */
    static final C7214v4 m41393m(C7150r4 r4Var, String str) {
        for (C7214v4 v4Var : r4Var.mo23813K()) {
            if (v4Var.mo23949I().equals(str)) {
                return v4Var;
            }
        }
        return null;
    }

    /* renamed from: n */
    static final Object m41394n(C7150r4 r4Var, String str) {
        C7214v4 m = m41393m(r4Var, str);
        if (m == null) {
            return null;
        }
        if (m.mo23956Z()) {
            return m.mo23950J();
        }
        if (m.mo23954X()) {
            return Long.valueOf(m.mo23948F());
        }
        if (m.mo23952V()) {
            return Double.valueOf(m.mo23945C());
        }
        if (m.mo23947E() <= 0) {
            return null;
        }
        List<C7214v4> K = m.mo23951K();
        ArrayList arrayList = new ArrayList();
        for (C7214v4 v4Var : K) {
            if (v4Var != null) {
                Bundle bundle = new Bundle();
                for (C7214v4 v4Var2 : v4Var.mo23951K()) {
                    if (v4Var2.mo23956Z()) {
                        bundle.putString(v4Var2.mo23949I(), v4Var2.mo23950J());
                    } else if (v4Var2.mo23954X()) {
                        bundle.putLong(v4Var2.mo23949I(), v4Var2.mo23948F());
                    } else if (v4Var2.mo23952V()) {
                        bundle.putDouble(v4Var2.mo23949I(), v4Var2.mo23945C());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: o */
    private final void m41395o(StringBuilder sb, int i, List list) {
        if (list != null) {
            int i2 = i + 1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C7214v4 v4Var = (C7214v4) it.next();
                if (v4Var != null) {
                    m41397q(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    m41400u(sb, i2, MediationMetaData.KEY_NAME, v4Var.mo23955Y() ? this.f32389a.mo24414D().mo24096e(v4Var.mo23949I()) : null);
                    m41400u(sb, i2, "string_value", v4Var.mo23956Z() ? v4Var.mo23950J() : null);
                    m41400u(sb, i2, "int_value", v4Var.mo23954X() ? Long.valueOf(v4Var.mo23948F()) : null);
                    if (v4Var.mo23952V()) {
                        d = Double.valueOf(v4Var.mo23945C());
                    }
                    m41400u(sb, i2, "double_value", d);
                    if (v4Var.mo23947E() > 0) {
                        m41395o(sb, i2, v4Var.mo23951K());
                    }
                    m41397q(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* renamed from: p */
    private final void m41396p(StringBuilder sb, int i, C7021j3 j3Var) {
        String str;
        if (j3Var != null) {
            m41397q(sb, i);
            sb.append("filter {\n");
            if (j3Var.mo23549J()) {
                m41400u(sb, i, "complement", Boolean.valueOf(j3Var.mo23548I()));
            }
            if (j3Var.mo23551L()) {
                m41400u(sb, i, "param_name", this.f32389a.mo24414D().mo24096e(j3Var.mo23547G()));
            }
            if (j3Var.mo23552M()) {
                int i2 = i + 1;
                C7213v3 F = j3Var.mo23546F();
                if (F != null) {
                    m41397q(sb, i2);
                    sb.append("string_filter {\n");
                    if (F.mo23943K()) {
                        switch (F.mo23944L()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        m41400u(sb, i2, "match_type", str);
                    }
                    if (F.mo23942J()) {
                        m41400u(sb, i2, "expression", F.mo23938F());
                    }
                    if (F.mo23941I()) {
                        m41400u(sb, i2, "case_sensitive", Boolean.valueOf(F.mo23940H()));
                    }
                    if (F.mo23937C() > 0) {
                        m41397q(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : F.mo23939G()) {
                            m41397q(sb, i2 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    m41397q(sb, i2);
                    sb.append("}\n");
                }
            }
            if (j3Var.mo23550K()) {
                m41401v(sb, i + 1, "number_filter", j3Var.mo23545E());
            }
            m41397q(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: q */
    private static final void m41397q(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: r */
    private static final String m41398r(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: t */
    private static final void m41399t(StringBuilder sb, int i, String str, C6991h5 h5Var) {
        if (h5Var != null) {
            m41397q(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (h5Var.mo23476D() != 0) {
                m41397q(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long l : h5Var.mo23482M()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (h5Var.mo23478F() != 0) {
                m41397q(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long l2 : h5Var.mo23484O()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l2);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (h5Var.mo23475C() != 0) {
                m41397q(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (C7118p4 p4Var : h5Var.mo23481L()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(p4Var.mo23735J() ? Integer.valueOf(p4Var.mo23732C()) : null);
                    sb.append(":");
                    sb.append(p4Var.mo23734I() ? Long.valueOf(p4Var.mo23733D()) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (h5Var.mo23477E() != 0) {
                m41397q(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (C7023j5 j5Var : h5Var.mo23483N()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(j5Var.mo23557K() ? Integer.valueOf(j5Var.mo23554D()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : j5Var.mo23556H()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            m41397q(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: u */
    private static final void m41400u(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m41397q(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: v */
    private static final void m41401v(StringBuilder sb, int i, String str, C7101o3 o3Var) {
        if (o3Var != null) {
            m41397q(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (o3Var.mo23715I()) {
                int N = o3Var.mo23720N();
                m41400u(sb, i, "comparison_type", N != 1 ? N != 2 ? N != 3 ? N != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
            }
            if (o3Var.mo23717K()) {
                m41400u(sb, i, "match_as_float", Boolean.valueOf(o3Var.mo23714H()));
            }
            if (o3Var.mo23716J()) {
                m41400u(sb, i, "comparison_value", o3Var.mo23711E());
            }
            if (o3Var.mo23719M()) {
                m41400u(sb, i, "min_comparison_value", o3Var.mo23713G());
            }
            if (o3Var.mo23718L()) {
                m41400u(sb, i, "max_comparison_value", o3Var.mo23712F());
            }
            m41397q(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: w */
    static int m41402w(C6889b5 b5Var, String str) {
        for (int i = 0; i < b5Var.mo23107o0(); i++) {
            if (str.equals(b5Var.mo23101i0(i).mo23627H())) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r0.get("_o");
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C7524v mo24193A(com.google.android.gms.internal.measurement.C6883b r9) {
        /*
            r8 = this;
            java.util.Map r0 = r9.mo23029e()
            r1 = 1
            android.os.Bundle r0 = r8.mo24205y(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001c
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r1.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r1 = "app"
        L_0x001e:
            r5 = r1
            java.lang.String r1 = r9.mo23028d()
            java.lang.String r1 = p402y5.C13039q.m61355b(r1)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = r9.mo23028d()
        L_0x002d:
            r3 = r1
            com.google.android.gms.measurement.internal.v r1 = new com.google.android.gms.measurement.internal.v
            com.google.android.gms.measurement.internal.t r4 = new com.google.android.gms.measurement.internal.t
            r4.<init>(r0)
            long r6 = r9.mo23024a()
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7325c9.mo24193A(com.google.android.gms.internal.measurement.b):com.google.android.gms.measurement.internal.v");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final C7150r4 mo24194B(C7469q qVar) {
        C7134q4 G = C7150r4.m40779G();
        G.mo23751D(qVar.f32879e);
        C7491s sVar = new C7491s(qVar.f32880f);
        while (sVar.hasNext()) {
            String a = sVar.next();
            C7198u4 G2 = C7214v4.m41014G();
            G2.mo23910B(a);
            Object N1 = qVar.f32880f.mo24664N1(a);
            C4141r.m28221k(N1);
            mo24200J(G2, N1);
            G.mo23761v(G2);
        }
        return (C7150r4) G.mo23357k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final String mo24195D(C6872a5 a5Var) {
        if (a5Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (C6906c5 c5Var : a5Var.mo23003F()) {
            if (c5Var != null) {
                m41397q(sb, 1);
                sb.append("bundle {\n");
                if (c5Var.mo23233q1()) {
                    m41400u(sb, 1, "protocol_version", Integer.valueOf(c5Var.mo23243z1()));
                }
                C7016ie.m40214b();
                if (this.f32389a.mo24443z().mo24279B((String) null, C7516u2.f33065n0) && this.f32389a.mo24443z().mo24279B(c5Var.mo23219T1(), C7516u2.f33069p0) && c5Var.mo23236t1()) {
                    m41400u(sb, 1, "session_stitching_token", c5Var.mo23209M());
                }
                m41400u(sb, 1, "platform", c5Var.mo23205K());
                if (c5Var.mo23229m1()) {
                    m41400u(sb, 1, "gmp_version", Long.valueOf(c5Var.mo23202I1()));
                }
                if (c5Var.mo23240x1()) {
                    m41400u(sb, 1, "uploading_gmp_version", Long.valueOf(c5Var.mo23212N1()));
                }
                if (c5Var.mo23227k1()) {
                    m41400u(sb, 1, "dynamite_version", Long.valueOf(c5Var.mo23197F1()));
                }
                if (c5Var.mo23224h1()) {
                    m41400u(sb, 1, "config_version", Long.valueOf(c5Var.mo23193D1()));
                }
                m41400u(sb, 1, "gmp_app_id", c5Var.mo23200H());
                m41400u(sb, 1, "admob_app_id", c5Var.mo23218S1());
                m41400u(sb, 1, "app_id", c5Var.mo23219T1());
                m41400u(sb, 1, "app_version", c5Var.mo23189C());
                if (c5Var.mo23187B0()) {
                    m41400u(sb, 1, "app_version_major", Integer.valueOf(c5Var.mo23222c0()));
                }
                m41400u(sb, 1, "firebase_instance_id", c5Var.mo23198G());
                if (c5Var.mo23226j1()) {
                    m41400u(sb, 1, "dev_cert_hash", Long.valueOf(c5Var.mo23195E1()));
                }
                m41400u(sb, 1, "app_store", c5Var.mo23221V1());
                if (c5Var.mo23239w1()) {
                    m41400u(sb, 1, "upload_timestamp_millis", Long.valueOf(c5Var.mo23210M1()));
                }
                if (c5Var.mo23237u1()) {
                    m41400u(sb, 1, "start_timestamp_millis", Long.valueOf(c5Var.mo23208L1()));
                }
                if (c5Var.mo23228l1()) {
                    m41400u(sb, 1, "end_timestamp_millis", Long.valueOf(c5Var.mo23199G1()));
                }
                if (c5Var.mo23232p1()) {
                    m41400u(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c5Var.mo23206K1()));
                }
                if (c5Var.mo23231o1()) {
                    m41400u(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c5Var.mo23204J1()));
                }
                m41400u(sb, 1, "app_instance_id", c5Var.mo23220U1());
                m41400u(sb, 1, "resettable_device_id", c5Var.mo23207L());
                m41400u(sb, 1, "ds_id", c5Var.mo23196F());
                if (c5Var.mo23230n1()) {
                    m41400u(sb, 1, "limited_ad_tracking", Boolean.valueOf(c5Var.mo23242z0()));
                }
                m41400u(sb, 1, "os_version", c5Var.mo23203J());
                m41400u(sb, 1, "device_model", c5Var.mo23194E());
                m41400u(sb, 1, "user_default_language", c5Var.mo23211N());
                if (c5Var.mo23238v1()) {
                    m41400u(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c5Var.mo23188B1()));
                }
                if (c5Var.mo23190C0()) {
                    m41400u(sb, 1, "bundle_sequential_index", Integer.valueOf(c5Var.mo23223e1()));
                }
                if (c5Var.mo23235s1()) {
                    m41400u(sb, 1, "service_upload", Boolean.valueOf(c5Var.mo23185A0()));
                }
                m41400u(sb, 1, "health_monitor", c5Var.mo23201I());
                if (c5Var.mo23234r1()) {
                    m41400u(sb, 1, "retry_counter", Integer.valueOf(c5Var.mo23186A1()));
                }
                if (c5Var.mo23225i1()) {
                    m41400u(sb, 1, "consent_signals", c5Var.mo23192D());
                }
                List<C7055l5> Q = c5Var.mo23216Q();
                if (Q != null) {
                    for (C7055l5 l5Var : Q) {
                        if (l5Var != null) {
                            m41397q(sb, 2);
                            sb.append("user_property {\n");
                            m41400u(sb, 2, "set_timestamp_millis", l5Var.mo23631T() ? Long.valueOf(l5Var.mo23626E()) : null);
                            m41400u(sb, 2, MediationMetaData.KEY_NAME, this.f32389a.mo24414D().mo24097f(l5Var.mo23627H()));
                            m41400u(sb, 2, "string_value", l5Var.mo23628I());
                            m41400u(sb, 2, "int_value", l5Var.mo23630S() ? Long.valueOf(l5Var.mo23625D()) : null);
                            m41400u(sb, 2, "double_value", l5Var.mo23629R() ? Double.valueOf(l5Var.mo23624C()) : null);
                            m41397q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C7086n4> O = c5Var.mo23213O();
                if (O != null) {
                    for (C7086n4 n4Var : O) {
                        if (n4Var != null) {
                            m41397q(sb, 2);
                            sb.append("audience_membership {\n");
                            if (n4Var.mo23692M()) {
                                m41400u(sb, 2, "audience_id", Integer.valueOf(n4Var.mo23688C()));
                            }
                            if (n4Var.mo23693N()) {
                                m41400u(sb, 2, "new_audience", Boolean.valueOf(n4Var.mo23691L()));
                            }
                            m41399t(sb, 2, "current_data", n4Var.mo23689F());
                            if (n4Var.mo23694O()) {
                                m41399t(sb, 2, "previous_data", n4Var.mo23690G());
                            }
                            m41397q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C7150r4> P = c5Var.mo23215P();
                if (P != null) {
                    for (C7150r4 r4Var : P) {
                        if (r4Var != null) {
                            m41397q(sb, 2);
                            sb.append("event {\n");
                            m41400u(sb, 2, MediationMetaData.KEY_NAME, this.f32389a.mo24414D().mo24095d(r4Var.mo23812J()));
                            if (r4Var.mo23816V()) {
                                m41400u(sb, 2, "timestamp_millis", Long.valueOf(r4Var.mo23810F()));
                            }
                            if (r4Var.mo23815U()) {
                                m41400u(sb, 2, "previous_timestamp_millis", Long.valueOf(r4Var.mo23809E()));
                            }
                            if (r4Var.mo23814T()) {
                                m41400u(sb, 2, "count", Integer.valueOf(r4Var.mo23807C()));
                            }
                            if (r4Var.mo23808D() != 0) {
                                m41395o(sb, 2, r4Var.mo23813K());
                            }
                            m41397q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m41397q(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final String mo24196E(C6989h3 h3Var) {
        if (h3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (h3Var.mo23471Q()) {
            m41400u(sb, 0, "filter_id", Integer.valueOf(h3Var.mo23462D()));
        }
        m41400u(sb, 0, "event_name", this.f32389a.mo24414D().mo24095d(h3Var.mo23465I()));
        String r = m41398r(h3Var.mo23467M(), h3Var.mo23468N(), h3Var.mo23469O());
        if (!r.isEmpty()) {
            m41400u(sb, 0, "filter_type", r);
        }
        if (h3Var.mo23470P()) {
            m41401v(sb, 1, "event_count_filter", h3Var.mo23464H());
        }
        if (h3Var.mo23461C() > 0) {
            sb.append("  filters {\n");
            for (C7021j3 p : h3Var.mo23466J()) {
                m41396p(sb, 2, p);
            }
        }
        m41397q(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final String mo24197F(C7133q3 q3Var) {
        if (q3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (q3Var.mo23746L()) {
            m41400u(sb, 0, "filter_id", Integer.valueOf(q3Var.mo23740C()));
        }
        m41400u(sb, 0, "property_name", this.f32389a.mo24414D().mo24097f(q3Var.mo23742G()));
        String r = m41398r(q3Var.mo23743I(), q3Var.mo23744J(), q3Var.mo23745K());
        if (!r.isEmpty()) {
            m41400u(sb, 0, "filter_type", r);
        }
        m41396p(sb, 1, q3Var.mo23741D());
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final List mo24198G(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f32389a.mo24135l().mo24261w().mo24209b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f32389a.mo24135l().mo24261w().mo24210c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final Map mo24199I(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(mo24199I((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(mo24199I((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(mo24199I((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo24200J(C7198u4 u4Var, Object obj) {
        C4141r.m28221k(obj);
        u4Var.mo23918y();
        u4Var.mo23916v();
        u4Var.mo23915u();
        u4Var.mo23917x();
        if (obj instanceof String) {
            u4Var.mo23911C((String) obj);
        } else if (obj instanceof Long) {
            u4Var.mo23909A(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            u4Var.mo23919z(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    C7198u4 G = C7214v4.m41014G();
                    for (String str : bundle.keySet()) {
                        C7198u4 G2 = C7214v4.m41014G();
                        G2.mo23910B(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            G2.mo23909A(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            G2.mo23911C((String) obj2);
                        } else if (obj2 instanceof Double) {
                            G2.mo23919z(((Double) obj2).doubleValue());
                        }
                        G.mo23914s(G2);
                    }
                    if (G.mo23912p() > 0) {
                        arrayList.add((C7214v4) G.mo23357k());
                    }
                }
            }
            u4Var.mo23913r(arrayList);
        } else {
            this.f32389a.mo24135l().mo24256q().mo24209b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo24201K(C7039k5 k5Var, Object obj) {
        C4141r.m28221k(obj);
        k5Var.mo23602s();
        k5Var.mo23601r();
        k5Var.mo23600p();
        if (obj instanceof String) {
            k5Var.mo23607z((String) obj);
        } else if (obj instanceof Long) {
            k5Var.mo23604v(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            k5Var.mo23603u(((Double) obj).doubleValue());
        } else {
            this.f32389a.mo24135l().mo24256q().mo24209b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo24202M(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.f32389a.mo24116a().mo18370a() - j) > j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final byte[] mo24203O(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f32389a.mo24135l().mo24256q().mo24209b("Failed to gzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo24151j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final long mo24204x(byte[] bArr) {
        C4141r.m28221k(bArr);
        this.f32389a.mo24423N().mo24189f();
        MessageDigest t = C7391i9.m41603t();
        if (t != null) {
            return C7391i9.m41602q0(t.digest(bArr));
        }
        this.f32389a.mo24135l().mo24256q().mo24208a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final Bundle mo24205y(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(mo24205y((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f32389a.mo24135l().mo24256q().mo24208a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable mo24206z(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002f
        L_0x001c:
            com.google.android.gms.measurement.internal.j4 r5 = r4.f32389a     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.f3 r5 = r5.mo24135l()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24256q()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo24208a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002f:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7325c9.mo24206z(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }
}
