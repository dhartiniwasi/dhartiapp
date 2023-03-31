package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.firebase.auth.y0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C7866y0 extends C4240a {
    public static final Parcelable.Creator<C7866y0> CREATOR = new C7823l1();

    /* renamed from: a */
    private String f34220a;

    /* renamed from: b */
    private String f34221b;

    /* renamed from: c */
    private boolean f34222c;

    /* renamed from: d */
    private boolean f34223d;

    /* renamed from: e */
    private Uri f34224e;

    /* renamed from: com.google.firebase.auth.y0$a */
    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public static class C7867a {

        /* renamed from: a */
        private String f34225a;

        /* renamed from: b */
        private Uri f34226b;

        /* renamed from: c */
        private boolean f34227c;

        /* renamed from: d */
        private boolean f34228d;

        /* renamed from: a */
        public C7866y0 mo26220a() {
            String str;
            String str2 = this.f34225a;
            Uri uri = this.f34226b;
            if (uri == null) {
                str = null;
            } else {
                str = uri.toString();
            }
            return new C7866y0(str2, str, this.f34227c, this.f34228d);
        }

        /* renamed from: b */
        public C7867a mo26221b(String str) {
            if (str == null) {
                this.f34227c = true;
            } else {
                this.f34225a = str;
            }
            return this;
        }

        /* renamed from: c */
        public C7867a mo26222c(Uri uri) {
            if (uri == null) {
                this.f34228d = true;
            } else {
                this.f34226b = uri;
            }
            return this;
        }
    }

    C7866y0(String str, String str2, boolean z, boolean z2) {
        this.f34220a = str;
        this.f34221b = str2;
        this.f34222c = z;
        this.f34223d = z2;
        this.f34224e = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    /* renamed from: I1 */
    public Uri mo26214I1() {
        return this.f34224e;
    }

    /* renamed from: J1 */
    public final boolean mo26215J1() {
        return this.f34222c;
    }

    /* renamed from: e */
    public final boolean mo26216e() {
        return this.f34223d;
    }

    /* renamed from: u0 */
    public String mo26217u0() {
        return this.f34220a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, mo26217u0(), false);
        C4243c.m28620q(parcel, 3, this.f34221b, false);
        C4243c.m28606c(parcel, 4, this.f34222c);
        C4243c.m28606c(parcel, 5, this.f34223d);
        C4243c.m28605b(parcel, a);
    }

    public final String zza() {
        return this.f34221b;
    }
}
