package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.facebook.ads.AdError;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p053g4.C4409t;
import p060h4.C4541l4;
import p060h4.C4596v;
import p060h4.C4607w4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ru2 implements qu2 {

    /* renamed from: a */
    private final ConcurrentHashMap f17104a;

    /* renamed from: b */
    private final xu2 f17105b;

    /* renamed from: c */
    private final tu2 f17106c = new tu2();

    public ru2(xu2 xu2) {
        this.f17104a = new ConcurrentHashMap(xu2.f20352f);
        this.f17105b = xu2;
    }

    /* renamed from: e */
    private final void m20039e() {
        Parcelable.Creator<xu2> creator = xu2.CREATOR;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14713v5)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f17105b.f20350d);
            sb.append(" PoolCollection");
            sb.append(this.f17106c.mo14393b());
            int i = 0;
            for (Map.Entry entry : this.f17104a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((bv2) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((pu2) entry.getValue()).mo13385b(); i2++) {
                    sb.append("[O]");
                }
                for (int b = ((pu2) entry.getValue()).mo13385b(); b < this.f17105b.f20352f; b++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((pu2) entry.getValue()).mo13390g());
                sb.append("\n");
            }
            while (i < this.f17105b.f20351e) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            pm0.m18662b(sb.toString());
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo13602a(bv2 bv2, zu2 zu2) {
        boolean h;
        pu2 pu2 = (pu2) this.f17104a.get(bv2);
        zu2.f21283d = C4409t.m29310b().mo18370a();
        if (pu2 == null) {
            xu2 xu2 = this.f17105b;
            pu2 = new pu2(xu2.f20352f, xu2.f20353g * AdError.NETWORK_ERROR_CODE);
            int size = this.f17104a.size();
            xu2 xu22 = this.f17105b;
            if (size == xu22.f20351e) {
                int i = xu22.f20359u;
                int i2 = i - 1;
                bv2 bv22 = null;
                if (i != 0) {
                    long j = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry entry : this.f17104a.entrySet()) {
                            if (((pu2) entry.getValue()).mo13386c() < j) {
                                j = ((pu2) entry.getValue()).mo13386c();
                                bv22 = (bv2) entry.getKey();
                            }
                        }
                        if (bv22 != null) {
                            this.f17104a.remove(bv22);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : this.f17104a.entrySet()) {
                            if (((pu2) entry2.getValue()).mo13387d() < j) {
                                j = ((pu2) entry2.getValue()).mo13387d();
                                bv22 = (bv2) entry2.getKey();
                            }
                        }
                        if (bv22 != null) {
                            this.f17104a.remove(bv22);
                        }
                    } else if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : this.f17104a.entrySet()) {
                            if (((pu2) entry3.getValue()).mo13384a() < i3) {
                                i3 = ((pu2) entry3.getValue()).mo13384a();
                                bv22 = (bv2) entry3.getKey();
                            }
                        }
                        if (bv22 != null) {
                            this.f17104a.remove(bv22);
                        }
                    }
                    this.f17106c.mo14398g();
                } else {
                    throw null;
                }
            }
            this.f17104a.put(bv2, pu2);
            this.f17106c.mo14395d();
        }
        h = pu2.mo13391h(zu2);
        this.f17106c.mo14394c();
        su2 a = this.f17106c.mo14392a();
        ov2 f = pu2.mo13389f();
        C2601lv G = C2824rv.m20046G();
        C2527jv G2 = C2564kv.m15626G();
        G2.mo11522u(2);
        C2750pv G3 = C2787qv.m19370G();
        G3.mo13393p(a.f17661a);
        G3.mo13394r(a.f17662b);
        G3.mo13395s(f.f15375b);
        G2.mo11521s(G3);
        G.mo12153p(G2);
        zu2.f21280a.mo9830d().mo8232c().mo10154V((C2824rv) G.mo13423m());
        m20039e();
        return h;
    }

    @Deprecated
    /* renamed from: b */
    public final bv2 mo13603b(C4541l4 l4Var, String str, C4607w4 w4Var) {
        return new cv2(l4Var, str, new ch0(this.f17105b.f20348b).mo9166a().f8266k, this.f17105b.f20354h, w4Var);
    }

    /* renamed from: c */
    public final synchronized boolean mo13604c(bv2 bv2) {
        pu2 pu2 = (pu2) this.f17104a.get(bv2);
        if (pu2 == null) {
            return true;
        }
        if (pu2.mo13385b() < this.f17105b.f20352f) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final synchronized zu2 mo13605d(bv2 bv2) {
        zu2 zu2;
        pu2 pu2 = (pu2) this.f17104a.get(bv2);
        if (pu2 != null) {
            zu2 = pu2.mo13388e();
            if (zu2 == null) {
                this.f17106c.mo14396e();
            }
            ov2 f = pu2.mo13389f();
            if (zu2 != null) {
                C2601lv G = C2824rv.m20046G();
                C2527jv G2 = C2564kv.m15626G();
                G2.mo11522u(2);
                C2675nv G3 = C2712ov.m18098G();
                G3.mo12712p(f.f15374a);
                G3.mo12713r(f.f15375b);
                G2.mo11519p(G3);
                G.mo12153p(G2);
                zu2.f21280a.mo9830d().mo8232c().mo10156k0((C2824rv) G.mo13423m());
            }
            m20039e();
        } else {
            this.f17106c.mo14397f();
            m20039e();
            zu2 = null;
        }
        return zu2;
    }

    public final xu2 zza() {
        return this.f17105b;
    }
}
