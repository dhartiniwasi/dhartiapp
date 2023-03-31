package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.core.content.res.C0698e;
import androidx.core.provider.C0795g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.core.provider.d */
/* compiled from: FontProvider */
class C0786d {

    /* renamed from: a */
    private static final Comparator<byte[]> f2354a = C0785c.f2353a;

    /* renamed from: androidx.core.provider.d$a */
    /* compiled from: FontProvider */
    static class C0787a {
        /* renamed from: a */
        static Cursor m3553a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* renamed from: b */
    private static List<byte[]> m3546b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: c */
    private static boolean m3547c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static List<List<byte[]>> m3548d(C0788e eVar, Resources resources) {
        if (eVar.mo3160b() != null) {
            return eVar.mo3160b();
        }
        return C0698e.m3230c(resources, eVar.mo3161c());
    }

    /* renamed from: e */
    static C0795g.C0796a m3549e(Context context, C0788e eVar, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo f = m3550f(context.getPackageManager(), eVar, context.getResources());
        if (f == null) {
            return C0795g.C0796a.m3574a(1, (C0795g.C0797b[]) null);
        }
        return C0795g.C0796a.m3574a(0, m3552h(context, eVar, f.authority, cancellationSignal));
    }

    /* renamed from: f */
    static ProviderInfo m3550f(PackageManager packageManager, C0788e eVar, Resources resources) throws PackageManager.NameNotFoundException {
        String e = eVar.mo3163e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e);
        } else if (resolveContentProvider.packageName.equals(eVar.mo3164f())) {
            List<byte[]> b = m3546b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b, f2354a);
            List<List<byte[]>> d = m3548d(eVar, resources);
            for (int i = 0; i < d.size(); i++) {
                ArrayList arrayList = new ArrayList(d.get(i));
                Collections.sort(arrayList, f2354a);
                if (m3547c(b, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + e + ", but package was not " + eVar.mo3164f());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ int m3551g(byte[] r4, byte[] r5) {
        /*
            int r0 = r4.length
            int r1 = r5.length
            if (r0 == r1) goto L_0x0008
            int r4 = r4.length
            int r5 = r5.length
        L_0x0006:
            int r4 = r4 - r5
            return r4
        L_0x0008:
            r0 = 0
            r1 = 0
        L_0x000a:
            int r2 = r4.length
            if (r1 >= r2) goto L_0x001b
            byte r2 = r4[r1]
            byte r3 = r5[r1]
            if (r2 == r3) goto L_0x0018
            byte r4 = r4[r1]
            byte r5 = r5[r1]
            goto L_0x0006
        L_0x0018:
            int r1 = r1 + 1
            goto L_0x000a
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C0786d.m3551g(byte[], byte[]):int");
    }

    /* renamed from: h */
    static C0795g.C0797b[] m3552h(Context context, C0788e eVar, String str, CancellationSignal cancellationSignal) {
        int i;
        Uri uri;
        boolean z;
        int i2;
        Cursor query;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            ContentResolver contentResolver = context.getContentResolver();
            if (Build.VERSION.SDK_INT > 16) {
                query = C0787a.m3553a(contentResolver, build, strArr, "query = ?", new String[]{eVar.mo3165g()}, (String) null, cancellationSignal);
            } else {
                query = contentResolver.query(build, strArr, "query = ?", new String[]{eVar.mo3165g()}, (String) null);
            }
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i3 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i4 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        i = i3;
                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i = i3;
                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    int i5 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i2 = i;
                        z = false;
                    } else {
                        i2 = i;
                        z = true;
                    }
                    arrayList2.add(C0795g.C0797b.m3577a(uri, i4, i5, z, i2));
                }
                arrayList = arrayList2;
            }
            return (C0795g.C0797b[]) arrayList.toArray(new C0795g.C0797b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
