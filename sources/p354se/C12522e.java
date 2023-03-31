package p354se;

import java.util.List;
import p383vn.hunghd.flutterdownloader.DownloadWorker;

/* renamed from: se.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12522e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DownloadWorker f46005a;

    /* renamed from: b */
    public final /* synthetic */ List f46006b;

    public /* synthetic */ C12522e(DownloadWorker downloadWorker, List list) {
        this.f46005a = downloadWorker;
        this.f46006b = list;
    }

    public final void run() {
        DownloadWorker.m60998w(this.f46005a, this.f46006b);
    }
}
