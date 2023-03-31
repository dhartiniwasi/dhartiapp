package com.onesignal;

import android.content.Context;
import android.net.Uri;
import java.security.SecureRandom;
import org.json.JSONObject;

/* renamed from: com.onesignal.v1 */
/* compiled from: OSNotificationGenerationJob */
public class C8632v1 {

    /* renamed from: a */
    private C8575q1 f36077a;

    /* renamed from: b */
    private Context f36078b;

    /* renamed from: c */
    private JSONObject f36079c;

    /* renamed from: d */
    private boolean f36080d;

    /* renamed from: e */
    private boolean f36081e;

    /* renamed from: f */
    private Long f36082f;

    /* renamed from: g */
    private CharSequence f36083g;

    /* renamed from: h */
    private CharSequence f36084h;

    /* renamed from: i */
    private Uri f36085i;

    /* renamed from: j */
    private Integer f36086j;

    /* renamed from: k */
    private Integer f36087k;

    /* renamed from: l */
    private Uri f36088l;

    C8632v1(Context context) {
        this.f36078b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Integer mo28247a() {
        return Integer.valueOf(this.f36077a.mo28119f());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo28248b() {
        return C8338d3.m46573u0(this.f36079c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public CharSequence mo28249c() {
        CharSequence charSequence = this.f36083g;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f36077a.mo28125i();
    }

    /* renamed from: d */
    public Context mo28250d() {
        return this.f36078b;
    }

    /* renamed from: e */
    public JSONObject mo28251e() {
        return this.f36079c;
    }

    /* renamed from: f */
    public C8575q1 mo28252f() {
        return this.f36077a;
    }

    /* renamed from: g */
    public Uri mo28253g() {
        return this.f36088l;
    }

    /* renamed from: h */
    public Integer mo28254h() {
        return this.f36086j;
    }

    /* renamed from: i */
    public Uri mo28255i() {
        return this.f36085i;
    }

    /* renamed from: j */
    public Long mo28256j() {
        return this.f36082f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public CharSequence mo28257k() {
        CharSequence charSequence = this.f36084h;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f36077a.mo28091C();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo28258l() {
        return this.f36077a.mo28136s() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo28259m() {
        return this.f36081e;
    }

    /* renamed from: n */
    public boolean mo28260n() {
        return this.f36080d;
    }

    /* renamed from: o */
    public void mo28261o(Context context) {
        this.f36078b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo28262p(boolean z) {
        this.f36081e = z;
    }

    /* renamed from: q */
    public void mo28263q(JSONObject jSONObject) {
        this.f36079c = jSONObject;
    }

    /* renamed from: r */
    public void mo28264r(C8575q1 q1Var) {
        if (q1Var != null && !q1Var.mo28093E()) {
            C8575q1 q1Var2 = this.f36077a;
            if (q1Var2 == null || !q1Var2.mo28093E()) {
                q1Var.mo28096J(new SecureRandom().nextInt());
            } else {
                q1Var.mo28096J(this.f36077a.mo28119f());
            }
        }
        this.f36077a = q1Var;
    }

    /* renamed from: s */
    public void mo28265s(Integer num) {
        this.f36087k = num;
    }

    /* renamed from: t */
    public void mo28266t(Uri uri) {
        this.f36088l = uri;
    }

    public String toString() {
        return "OSNotificationGenerationJob{jsonPayload=" + this.f36079c + ", isRestoring=" + this.f36080d + ", isNotificationToDisplay=" + this.f36081e + ", shownTimeStamp=" + this.f36082f + ", overriddenBodyFromExtender=" + this.f36083g + ", overriddenTitleFromExtender=" + this.f36084h + ", overriddenSound=" + this.f36085i + ", overriddenFlags=" + this.f36086j + ", orgFlags=" + this.f36087k + ", orgSound=" + this.f36088l + ", notification=" + this.f36077a + '}';
    }

    /* renamed from: u */
    public void mo28268u(CharSequence charSequence) {
        this.f36083g = charSequence;
    }

    /* renamed from: v */
    public void mo28269v(Integer num) {
        this.f36086j = num;
    }

    /* renamed from: w */
    public void mo28270w(Uri uri) {
        this.f36085i = uri;
    }

    /* renamed from: x */
    public void mo28271x(CharSequence charSequence) {
        this.f36084h = charSequence;
    }

    /* renamed from: y */
    public void mo28272y(boolean z) {
        this.f36080d = z;
    }

    /* renamed from: z */
    public void mo28273z(Long l) {
        this.f36082f = l;
    }

    C8632v1(Context context, JSONObject jSONObject) {
        this(context, new C8575q1(jSONObject), jSONObject);
    }

    C8632v1(Context context, C8575q1 q1Var, JSONObject jSONObject) {
        this.f36078b = context;
        this.f36079c = jSONObject;
        mo28264r(q1Var);
    }
}
