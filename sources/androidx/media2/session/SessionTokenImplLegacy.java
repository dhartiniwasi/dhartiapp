package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.p009v4.media.session.MediaSessionCompat;
import androidx.core.util.C0825c;
import androidx.media2.session.SessionToken;
import androidx.versionedparcelable.CustomVersionedParcelable;
import p152v0.C5755b;

final class SessionTokenImplLegacy extends CustomVersionedParcelable implements SessionToken.SessionTokenImpl {

    /* renamed from: a */
    private MediaSessionCompat.Token f3647a;

    /* renamed from: b */
    Bundle f3648b;

    /* renamed from: c */
    int f3649c;

    /* renamed from: d */
    int f3650d;

    /* renamed from: e */
    ComponentName f3651e;

    /* renamed from: f */
    String f3652f;

    /* renamed from: g */
    Bundle f3653g;

    SessionTokenImplLegacy() {
    }

    /* renamed from: c */
    public void mo3057c() {
        this.f3647a = MediaSessionCompat.Token.m842a(this.f3648b);
    }

    /* renamed from: d */
    public void mo3058d(boolean z) {
        MediaSessionCompat.Token token = this.f3647a;
        if (token != null) {
            synchronized (token) {
                C5755b e = this.f3647a.mo497e();
                this.f3647a.mo501h((C5755b) null);
                this.f3648b = this.f3647a.mo503i();
                this.f3647a.mo501h(e);
            }
            return;
        }
        this.f3648b = null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionTokenImplLegacy)) {
            return false;
        }
        SessionTokenImplLegacy sessionTokenImplLegacy = (SessionTokenImplLegacy) obj;
        int i = this.f3650d;
        if (i != sessionTokenImplLegacy.f3650d) {
            return false;
        }
        if (i == 100) {
            return C0825c.m3642a(this.f3647a, sessionTokenImplLegacy.f3647a);
        }
        if (i != 101) {
            return false;
        }
        return C0825c.m3642a(this.f3651e, sessionTokenImplLegacy.f3651e);
    }

    public int hashCode() {
        return C0825c.m3643b(Integer.valueOf(this.f3650d), this.f3651e, this.f3647a);
    }

    public String toString() {
        return "SessionToken {legacyToken=" + this.f3647a + "}";
    }
}
