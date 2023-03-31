package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.core.util.C0825c;
import androidx.media2.session.SessionToken;

final class SessionTokenImplBase implements SessionToken.SessionTokenImpl {

    /* renamed from: a */
    int f3640a;

    /* renamed from: b */
    int f3641b;

    /* renamed from: c */
    String f3642c;

    /* renamed from: d */
    String f3643d;

    /* renamed from: e */
    IBinder f3644e;

    /* renamed from: f */
    ComponentName f3645f;

    /* renamed from: g */
    Bundle f3646g;

    SessionTokenImplBase() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionTokenImplBase)) {
            return false;
        }
        SessionTokenImplBase sessionTokenImplBase = (SessionTokenImplBase) obj;
        if (this.f3640a != sessionTokenImplBase.f3640a || !TextUtils.equals(this.f3642c, sessionTokenImplBase.f3642c) || !TextUtils.equals(this.f3643d, sessionTokenImplBase.f3643d) || this.f3641b != sessionTokenImplBase.f3641b || !C0825c.m3642a(this.f3644e, sessionTokenImplBase.f3644e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C0825c.m3643b(Integer.valueOf(this.f3641b), Integer.valueOf(this.f3640a), this.f3642c, this.f3643d);
    }

    public String toString() {
        return "SessionToken {pkg=" + this.f3642c + " type=" + this.f3641b + " service=" + this.f3643d + " IMediaSession=" + this.f3644e + " extras=" + this.f3646g + "}";
    }
}
