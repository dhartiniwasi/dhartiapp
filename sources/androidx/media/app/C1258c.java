package androidx.media.app;

import android.app.PendingIntent;
import android.os.Build;
import android.support.p009v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.C0650k;
import androidx.core.app.C0651l;
import androidx.media.C1305i;
import androidx.media.C1306j;
import androidx.media.C1307k;

/* renamed from: androidx.media.app.c */
/* compiled from: NotificationCompat */
public class C1258c extends C0651l.C0662h {

    /* renamed from: e */
    int[] f3413e = null;

    /* renamed from: f */
    MediaSessionCompat.Token f3414f;

    /* renamed from: g */
    boolean f3415g;

    /* renamed from: h */
    PendingIntent f3416h;

    /* renamed from: o */
    private RemoteViews m5576o(C0651l.C0652a aVar) {
        boolean z = aVar.mo2897a() == null;
        RemoteViews remoteViews = new RemoteViews(this.f2143a.f2116a.getPackageName(), C1307k.notification_media_action);
        int i = C1305i.action0;
        remoteViews.setImageViewResource(i, aVar.mo2901e());
        if (!z) {
            remoteViews.setOnClickPendingIntent(i, aVar.mo2897a());
        }
        if (Build.VERSION.SDK_INT >= 15) {
            C1256a.m5570a(remoteViews, i, aVar.mo2906j());
        }
        return remoteViews;
    }

    /* renamed from: b */
    public void mo2909b(C0650k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1257b.m5574d(kVar.mo2896a(), C1257b.m5572b(C1257b.m5571a(), this.f3413e, this.f3414f));
        } else if (this.f3415g) {
            kVar.mo2896a().setOngoing(true);
        }
    }

    /* renamed from: i */
    public RemoteViews mo2958i(C0650k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return mo4517m();
    }

    /* renamed from: j */
    public RemoteViews mo2959j(C0650k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return mo4518n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public RemoteViews mo4517m() {
        int min = Math.min(this.f2143a.f2117b.size(), 5);
        RemoteViews c = mo2956c(false, mo4519p(min), false);
        c.removeAllViews(C1305i.media_actions);
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                c.addView(C1305i.media_actions, m5576o(this.f2143a.f2117b.get(i)));
            }
        }
        if (this.f3415g) {
            int i2 = C1305i.cancel_action;
            c.setViewVisibility(i2, 0);
            c.setInt(i2, "setAlpha", this.f2143a.f2116a.getResources().getInteger(C1306j.f3531a));
            c.setOnClickPendingIntent(i2, this.f3416h);
        } else {
            c.setViewVisibility(C1305i.cancel_action, 8);
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public RemoteViews mo4518n() {
        int i;
        RemoteViews c = mo2956c(false, mo4520q(), true);
        int size = this.f2143a.f2117b.size();
        int[] iArr = this.f3413e;
        if (iArr == null) {
            i = 0;
        } else {
            i = Math.min(iArr.length, 3);
        }
        c.removeAllViews(C1305i.media_actions);
        if (i > 0) {
            int i2 = 0;
            while (i2 < i) {
                if (i2 < size) {
                    c.addView(C1305i.media_actions, m5576o(this.f2143a.f2117b.get(this.f3413e[i2])));
                    i2++;
                } else {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(size - 1)}));
                }
            }
        }
        if (this.f3415g) {
            c.setViewVisibility(C1305i.end_padder, 8);
            int i3 = C1305i.cancel_action;
            c.setViewVisibility(i3, 0);
            c.setOnClickPendingIntent(i3, this.f3416h);
            c.setInt(i3, "setAlpha", this.f2143a.f2116a.getResources().getInteger(C1306j.f3531a));
        } else {
            c.setViewVisibility(C1305i.end_padder, 0);
            c.setViewVisibility(C1305i.cancel_action, 8);
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo4519p(int i) {
        if (i <= 3) {
            return C1307k.notification_template_big_media_narrow;
        }
        return C1307k.notification_template_big_media;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo4520q() {
        return C1307k.notification_template_media;
    }

    /* renamed from: r */
    public C1258c mo4521r(PendingIntent pendingIntent) {
        this.f3416h = pendingIntent;
        return this;
    }

    /* renamed from: s */
    public C1258c mo4522s(MediaSessionCompat.Token token) {
        this.f3414f = token;
        return this;
    }

    /* renamed from: t */
    public C1258c mo4523t(int... iArr) {
        this.f3413e = iArr;
        return this;
    }

    /* renamed from: u */
    public C1258c mo4524u(boolean z) {
        if (Build.VERSION.SDK_INT < 21) {
            this.f3415g = z;
        }
        return this;
    }
}
