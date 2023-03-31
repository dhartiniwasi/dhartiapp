package p293m7;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p033d5.C4141r;
import p067i5.C4694h;
import p218e6.C9975i;

/* renamed from: m7.h0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11825h0 {

    /* renamed from: d */
    private static final List f44505d = new ArrayList(Arrays.asList(new String[]{"firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp"}));

    /* renamed from: e */
    private static final C11825h0 f44506e = new C11825h0();

    /* renamed from: a */
    private C9975i f44507a;

    /* renamed from: b */
    private C9975i f44508b;

    /* renamed from: c */
    private long f44509c = 0;

    private C11825h0() {
    }

    /* renamed from: b */
    public static C11825h0 m57227b() {
        return f44506e;
    }

    /* renamed from: e */
    private static final void m57228e(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String remove : f44505d) {
            edit.remove(remove);
        }
        edit.commit();
    }

    /* renamed from: a */
    public final C9975i mo36047a() {
        if (C4694h.m30388d().mo18370a() - this.f44509c < 3600000) {
            return this.f44508b;
        }
        return null;
    }

    /* renamed from: c */
    public final void mo36048c(Context context) {
        C4141r.m28221k(context);
        m57228e(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f44507a = null;
        this.f44509c = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007f, code lost:
        if (r4.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN") == false) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e0  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36049d(com.google.firebase.auth.FirebaseAuth r13) {
        /*
            r12 = this;
            p033d5.C4141r.m28221k(r13)
            h7.f r0 = r13.mo26030l()
            android.content.Context r0 = r0.mo33469m()
            java.lang.String r1 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "firebaseAppName"
            java.lang.String r3 = ""
            java.lang.String r1 = r0.getString(r1, r3)
            h7.f r4 = r13.mo26030l()
            java.lang.String r4 = r4.mo33470q()
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0029
            return
        L_0x0029:
            java.lang.String r1 = "verifyAssertionRequest"
            boolean r4 = r0.contains(r1)
            r5 = -1
            java.lang.String r6 = "operation"
            r7 = 0
            java.lang.String r9 = "timestamp"
            r10 = 0
            if (r4 == 0) goto L_0x00ee
            java.lang.String r1 = r0.getString(r1, r3)
            android.os.Parcelable$Creator<com.google.android.gms.internal.firebase-auth-api.a0> r4 = com.google.android.gms.internal.p026firebaseauthapi.C3126a0.CREATOR
            e5.d r1 = p040e5.C4245e.m28631c(r1, r4)
            com.google.android.gms.internal.firebase-auth-api.a0 r1 = (com.google.android.gms.internal.p026firebaseauthapi.C3126a0) r1
            java.lang.String r4 = r0.getString(r6, r3)
            java.lang.String r6 = "tenantId"
            java.lang.String r6 = r0.getString(r6, r10)
            java.lang.String r11 = "firebaseUserUid"
            java.lang.String r3 = r0.getString(r11, r3)
            long r7 = r0.getLong(r9, r7)
            r12.f44509c = r7
            if (r6 == 0) goto L_0x0063
            r13.mo26043w(r6)
            r1.mo15692M1(r6)
        L_0x0063:
            int r6 = r4.hashCode()
            r7 = -98509410(0xfffffffffa20dd9e, float:-2.088156E35)
            r8 = 2
            r9 = 1
            if (r6 == r7) goto L_0x008c
            r7 = 175006864(0xa6e6490, float:1.1478197E-32)
            if (r6 == r7) goto L_0x0082
            r7 = 1450464913(0x56745691, float:6.7163159E13)
            if (r6 == r7) goto L_0x0079
            goto L_0x0096
        L_0x0079:
            java.lang.String r6 = "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0096
            goto L_0x0097
        L_0x0082:
            java.lang.String r2 = "com.google.firebase.auth.internal.NONGMSCORE_LINK"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0096
            r2 = 1
            goto L_0x0097
        L_0x008c:
            java.lang.String r2 = "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0096
            r2 = 2
            goto L_0x0097
        L_0x0096:
            r2 = -1
        L_0x0097:
            if (r2 == 0) goto L_0x00e0
            if (r2 == r9) goto L_0x00c0
            if (r2 == r8) goto L_0x00a0
            r12.f44507a = r10
            goto L_0x00ea
        L_0x00a0:
            com.google.firebase.auth.z r2 = r13.mo26031m()
            java.lang.String r2 = r2.mo26209b()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00bd
            com.google.firebase.auth.z r2 = r13.mo26031m()
            com.google.firebase.auth.p1 r1 = com.google.firebase.auth.C7840p1.m43486M1(r1)
            e6.i r13 = r13.mo26006Y(r2, r1)
            r12.f44507a = r13
            goto L_0x00ea
        L_0x00bd:
            r12.f44507a = r10
            goto L_0x00ea
        L_0x00c0:
            com.google.firebase.auth.z r2 = r13.mo26031m()
            java.lang.String r2 = r2.mo26209b()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00dd
            com.google.firebase.auth.z r2 = r13.mo26031m()
            com.google.firebase.auth.p1 r1 = com.google.firebase.auth.C7840p1.m43486M1(r1)
            e6.i r13 = r13.mo26005X(r2, r1)
            r12.f44507a = r13
            goto L_0x00ea
        L_0x00dd:
            r12.f44507a = r10
            goto L_0x00ea
        L_0x00e0:
            com.google.firebase.auth.p1 r1 = com.google.firebase.auth.C7840p1.m43486M1(r1)
            e6.i r13 = r13.mo26045y(r1)
            r12.f44507a = r13
        L_0x00ea:
            m57228e(r0)
            return
        L_0x00ee:
            java.lang.String r13 = "recaptchaToken"
            boolean r1 = r0.contains(r13)
            if (r1 == 0) goto L_0x0127
            java.lang.String r13 = r0.getString(r13, r3)
            java.lang.String r1 = r0.getString(r6, r3)
            long r3 = r0.getLong(r9, r7)
            r12.f44509c = r3
            int r3 = r1.hashCode()
            r4 = -214796028(0xfffffffff3327904, float:-1.4140065E31)
            if (r3 == r4) goto L_0x010e
            goto L_0x0117
        L_0x010e:
            java.lang.String r3 = "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0117
            goto L_0x0118
        L_0x0117:
            r2 = -1
        L_0x0118:
            if (r2 == 0) goto L_0x011d
            r12.f44508b = r10
            goto L_0x0123
        L_0x011d:
            e6.i r13 = p218e6.C9980l.m51031e(r13)
            r12.f44508b = r13
        L_0x0123:
            m57228e(r0)
            return
        L_0x0127:
            java.lang.String r13 = "statusCode"
            boolean r1 = r0.contains(r13)
            if (r1 == 0) goto L_0x0153
            r1 = 17062(0x42a6, float:2.3909E-41)
            int r13 = r0.getInt(r13, r1)
            java.lang.String r1 = "statusMessage"
            java.lang.String r1 = r0.getString(r1, r3)
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r2.<init>((int) r13, (java.lang.String) r1)
            long r3 = r0.getLong(r9, r7)
            r12.f44509c = r3
            m57228e(r0)
            h7.l r13 = com.google.android.gms.internal.p026firebaseauthapi.C3847vs.m27245a(r2)
            e6.i r13 = p218e6.C9980l.m51030d(r13)
            r12.f44507a = r13
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p293m7.C11825h0.mo36049d(com.google.firebase.auth.FirebaseAuth):void");
    }
}
