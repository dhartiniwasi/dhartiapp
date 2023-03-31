package p170y0;

import android.app.Notification;

/* renamed from: y0.e */
/* compiled from: ForegroundInfo */
public final class C6088e {

    /* renamed from: a */
    private final int f29479a;

    /* renamed from: b */
    private final int f29480b;

    /* renamed from: c */
    private final Notification f29481c;

    public C6088e(int i, Notification notification, int i2) {
        this.f29479a = i;
        this.f29481c = notification;
        this.f29480b = i2;
    }

    /* renamed from: a */
    public int mo20912a() {
        return this.f29480b;
    }

    /* renamed from: b */
    public Notification mo20913b() {
        return this.f29481c;
    }

    /* renamed from: c */
    public int mo20914c() {
        return this.f29479a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6088e.class != obj.getClass()) {
            return false;
        }
        C6088e eVar = (C6088e) obj;
        if (this.f29479a == eVar.f29479a && this.f29480b == eVar.f29480b) {
            return this.f29481c.equals(eVar.f29481c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f29479a * 31) + this.f29480b) * 31) + this.f29481c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.f29479a + ", mForegroundServiceType=" + this.f29480b + ", mNotification=" + this.f29481c + '}';
    }
}
