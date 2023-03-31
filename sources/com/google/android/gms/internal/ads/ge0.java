package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ge0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f9857a;

    /* renamed from: b */
    final /* synthetic */ String f9858b;

    /* renamed from: c */
    final /* synthetic */ ie0 f9859c;

    ge0(ie0 ie0, String str, String str2) {
        this.f9859c = ie0;
        this.f9857a = str;
        this.f9858b = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f9859c.f10753d.getSystemService("download");
        try {
            String str = this.f9857a;
            String str2 = this.f9858b;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            C4409t.m29326r();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f9859c.mo11984c("Could not store picture.");
        }
    }
}
