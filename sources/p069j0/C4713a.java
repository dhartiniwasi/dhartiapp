package p069j0;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.support.p009v4.media.MediaBrowserCompat;
import android.support.p009v4.media.session.MediaControllerCompat;
import android.support.p009v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.core.content.C0681a;
import java.util.List;

/* renamed from: j0.a */
/* compiled from: MediaButtonReceiver */
public class C4713a extends BroadcastReceiver {

    /* renamed from: j0.a$a */
    /* compiled from: MediaButtonReceiver */
    private static class C4714a extends MediaBrowserCompat.C0156c {

        /* renamed from: c */
        private final Context f25291c;

        /* renamed from: d */
        private final Intent f25292d;

        /* renamed from: e */
        private final BroadcastReceiver.PendingResult f25293e;

        /* renamed from: f */
        private MediaBrowserCompat f25294f;

        C4714a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f25291c = context;
            this.f25292d = intent;
            this.f25293e = pendingResult;
        }

        /* renamed from: e */
        private void m30442e() {
            this.f25294f.mo297b();
            this.f25293e.finish();
        }

        /* renamed from: a */
        public void mo309a() {
            new MediaControllerCompat(this.f25291c, this.f25294f.mo298c()).mo411a((KeyEvent) this.f25292d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            m30442e();
        }

        /* renamed from: b */
        public void mo310b() {
            m30442e();
        }

        /* renamed from: c */
        public void mo311c() {
            m30442e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo18374f(MediaBrowserCompat mediaBrowserCompat) {
            this.f25294f = mediaBrowserCompat;
        }
    }

    /* renamed from: a */
    public static ComponentName m30439a(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        } else if (queryBroadcastReceivers.size() <= 1) {
            return null;
        } else {
            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            return null;
        }
    }

    /* renamed from: b */
    private static ComponentName m30440b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }

    /* renamed from: c */
    public static KeyEvent m30441c(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaSessionCompat.mo461b().mo411a(keyEvent);
        return keyEvent;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName b = m30440b(context, "android.intent.action.MEDIA_BUTTON");
        if (b != null) {
            intent.setComponent(b);
            C0681a.m3158n(context, intent);
            return;
        }
        ComponentName b2 = m30440b(context, "android.media.browse.MediaBrowserService");
        if (b2 != null) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            C4714a aVar = new C4714a(applicationContext, intent, goAsync);
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, b2, aVar, (Bundle) null);
            aVar.mo18374f(mediaBrowserCompat);
            mediaBrowserCompat.mo296a();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }
}
