package p222ea;

import android.os.Environment;
import kotlin.jvm.internal.C11669k;
import p186ac.C6555j;
import p186ac.C6556k;
import p351sb.C12502a;

/* renamed from: ea.a */
/* compiled from: AndroidPathProviderPlugin.kt */
public final class C10023a implements C12502a, C6556k.C6560c {

    /* renamed from: a */
    private C6556k f39987a;

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        C11669k.m56787e(bVar, "flutterPluginBinding");
        C6556k kVar = new C6556k(bVar.mo37293b(), "android_path_provider");
        this.f39987a = kVar;
        kVar.mo22161e(this);
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        C11669k.m56787e(bVar, "binding");
        C6556k kVar = this.f39987a;
        if (kVar == null) {
            C11669k.m56797o("channel");
            kVar = null;
        }
        kVar.mo22161e((C6556k.C6560c) null);
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        C11669k.m56787e(jVar, "call");
        C11669k.m56787e(dVar, "result");
        if (C11669k.m56783a(jVar.f30999a, "getAlarmsPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_ALARMS).getAbsolutePath());
        } else if (C11669k.m56783a(jVar.f30999a, "getDCIMPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
        } else if (C11669k.m56783a(jVar.f30999a, "getDocumentsPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).getAbsolutePath());
        } else if (C11669k.m56783a(jVar.f30999a, "getDownloadsPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        } else if (C11669k.m56783a(jVar.f30999a, "getMoviesPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
        } else if (C11669k.m56783a(jVar.f30999a, "getMusicPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath());
        } else if (C11669k.m56783a(jVar.f30999a, "getNotificationsPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_NOTIFICATIONS).getAbsolutePath());
        } else if (C11669k.m56783a(jVar.f30999a, "getPicturesPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        } else if (C11669k.m56783a(jVar.f30999a, "getPodcastsPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PODCASTS).getAbsolutePath());
        } else if (C11669k.m56783a(jVar.f30999a, "getRingtonesPath")) {
            dVar.success(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES).getAbsolutePath());
        } else {
            dVar.notImplemented();
        }
    }
}
