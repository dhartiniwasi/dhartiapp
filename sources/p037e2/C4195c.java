package p037e2;

import p037e2.C4200e0;
import p161w3.C5918a0;
import p161w3.C5961r;

/* renamed from: e2.c */
/* compiled from: CeaUtil */
public final class C4195c {
    /* renamed from: a */
    public static void m28375a(long j, C5918a0 a0Var, C4200e0[] e0VarArr) {
        while (true) {
            boolean z = true;
            if (a0Var.mo20548a() > 1) {
                int c = m28377c(a0Var);
                int c2 = m28377c(a0Var);
                int e = a0Var.mo20552e() + c2;
                if (c2 == -1 || c2 > a0Var.mo20548a()) {
                    C5961r.m35215i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    e = a0Var.mo20553f();
                } else if (c == 4 && c2 >= 8) {
                    int C = a0Var.mo20534C();
                    int I = a0Var.mo20540I();
                    int m = I == 49 ? a0Var.mo20560m() : 0;
                    int C2 = a0Var.mo20534C();
                    if (I == 47) {
                        a0Var.mo20547P(1);
                    }
                    boolean z2 = C == 181 && (I == 49 || I == 47) && C2 == 3;
                    if (I == 49) {
                        if (m != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        m28376b(j, a0Var, e0VarArr);
                    }
                }
                a0Var.mo20546O(e);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m28376b(long j, C5918a0 a0Var, C4200e0[] e0VarArr) {
        int C = a0Var.mo20534C();
        if ((C & 64) != 0) {
            a0Var.mo20547P(1);
            int i = (C & 31) * 3;
            int e = a0Var.mo20552e();
            for (C4200e0 e0Var : e0VarArr) {
                a0Var.mo20546O(e);
                e0Var.mo6843d(a0Var, i);
                if (j != -9223372036854775807L) {
                    e0Var.mo6838a(j, 1, i, 0, (C4200e0.C4201a) null);
                }
            }
        }
    }

    /* renamed from: c */
    private static int m28377c(C5918a0 a0Var) {
        int i = 0;
        while (a0Var.mo20548a() != 0) {
            int C = a0Var.mo20534C();
            i += C;
            if (C != 255) {
                return i;
            }
        }
        return -1;
    }
}
