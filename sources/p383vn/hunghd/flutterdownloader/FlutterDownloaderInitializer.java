package p383vn.hunghd.flutterdownloader;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.work.C1532a;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p170y0.C6111t;

/* renamed from: vn.hunghd.flutterdownloader.FlutterDownloaderInitializer */
/* compiled from: FlutterDownloaderInitializer.kt */
public final class FlutterDownloaderInitializer extends ContentProvider {

    /* renamed from: a */
    public static final C12900a f47106a = new C12900a((C11665g) null);

    /* renamed from: vn.hunghd.flutterdownloader.FlutterDownloaderInitializer$a */
    /* compiled from: FlutterDownloaderInitializer.kt */
    public static final class C12900a {
        private C12900a() {
        }

        public /* synthetic */ C12900a(C11665g gVar) {
            this();
        }
    }

    /* renamed from: a */
    private final int m61004a(Context context) {
        try {
            ProviderInfo providerInfo = context.getPackageManager().getProviderInfo(new ComponentName(context, "vn.hunghd.flutterdownloader.FlutterDownloaderInitializer"), 128);
            C11669k.m56786d(providerInfo, "context.packageManager.g…T_META_DATA\n            )");
            int i = providerInfo.metaData.getInt("vn.hunghd.flutterdownloader.MAX_CONCURRENT_TASKS", 3);
            Log.d("DownloaderInitializer", "MAX_CONCURRENT_TASKS = " + i);
            return i;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("DownloaderInitializer", "Failed to load meta-data, NameNotFound: " + e.getMessage());
            return 3;
        } catch (NullPointerException e2) {
            Log.e("DownloaderInitializer", "Failed to load meta-data, NullPointer: " + e2.getMessage());
            return 3;
        }
    }

    /* renamed from: b */
    public Void mo37918b(Uri uri) {
        C11669k.m56787e(uri, "uri");
        return null;
    }

    /* renamed from: c */
    public Void mo37919c(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C11669k.m56787e(uri, "uri");
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        C11669k.m56787e(uri, "uri");
        return 0;
    }

    public /* bridge */ /* synthetic */ String getType(Uri uri) {
        return (String) mo37918b(uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        C11669k.m56787e(uri, "uri");
        return null;
    }

    public boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            C11669k.m56786d(context, "requireNotNull(this.cont…ext from the provider.\" }");
            C6111t.m35741h(context, new C1532a.C1534b().mo6298b(Executors.newFixedThreadPool(m61004a(context))).mo6297a());
            return true;
        }
        throw new IllegalArgumentException("Cannot find context from the provider.".toString());
    }

    public /* bridge */ /* synthetic */ Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return (Cursor) mo37919c(uri, strArr, str, strArr2, str2);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C11669k.m56787e(uri, "uri");
        return 0;
    }
}
