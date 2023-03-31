package p289lc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.core.content.C0689b;
import com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ActionBroadcastReceiver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: lc.b */
/* compiled from: Share */
class C11784b {

    /* renamed from: a */
    private Context f44428a;

    /* renamed from: b */
    private Activity f44429b;

    C11784b(Context context, Activity activity) {
        this.f44428a = context;
        this.f44429b = activity;
    }

    /* renamed from: a */
    private void m57120a() {
        File f = m57125f();
        if (f.exists()) {
            for (File delete : f.listFiles()) {
                delete.delete();
            }
            f.delete();
        }
    }

    /* renamed from: b */
    private static void m57121b(File file, File file2) throws IOException {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    fileInputStream.close();
                    return;
                }
            }
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    /* renamed from: c */
    private File m57122c(File file) throws IOException {
        File f = m57125f();
        if (!f.exists()) {
            f.mkdirs();
        }
        File file2 = new File(f, file.getName());
        m57121b(file, file2);
        return file2;
    }

    /* renamed from: d */
    private boolean m57123d(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            File externalFilesDir = this.f44428a.getExternalFilesDir((String) null);
            if (externalFilesDir == null || !canonicalPath.startsWith(externalFilesDir.getCanonicalPath())) {
                return false;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: e */
    private Context m57124e() {
        Activity activity = this.f44429b;
        if (activity != null) {
            return activity;
        }
        Context context = this.f44428a;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Both context and activity are null");
    }

    /* renamed from: f */
    private File m57125f() {
        return new File(m57124e().getExternalCacheDir(), "share");
    }

    /* renamed from: g */
    private String m57126g(String str) {
        return (str == null || !str.contains("/")) ? "*" : str.substring(0, str.indexOf("/"));
    }

    /* renamed from: h */
    private ArrayList<Uri> m57127h(List<String> list) throws IOException {
        ArrayList<Uri> arrayList = new ArrayList<>(list.size());
        for (String file : list) {
            File file2 = new File(file);
            if (!m57123d(file2)) {
                file2 = m57122c(file2);
            }
            Context e = m57124e();
            arrayList.add(C0689b.getUriForFile(e, m57124e().getPackageName() + ".flutter.share_provider", file2));
        }
        return arrayList;
    }

    /* renamed from: i */
    private String m57128i(List<String> list) {
        if (list.size() > 1) {
            String str = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                String str2 = list.get(i);
                if (!str.equals(str2)) {
                    if (!m57126g(str2).equals(m57126g(str))) {
                        return "*/*";
                    }
                    str = m57126g(str2) + "/*";
                }
            }
            return str;
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return "*/*";
        }
    }

    /* renamed from: m */
    private void m57129m(Intent intent) {
        Activity activity = this.f44429b;
        if (activity != null) {
            activity.startActivity(intent);
        } else if (this.f44428a != null) {
            intent.addFlags(268435456);
            this.f44428a.startActivity(intent);
        } else {
            throw new IllegalStateException("Both context and activity are null");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo36021j(Activity activity) {
        this.f44429b = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo36022k(String str, String str2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Non-empty text expected");
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str2);
        intent.setType("text/plain");
        m57129m(Intent.createChooser(intent, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo36023l(List<String> list, List<String> list2, String str, String str2) throws IOException {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Non-empty path expected");
        }
        m57120a();
        ArrayList<Uri> h = m57127h(list);
        Intent intent = new Intent();
        if (h.isEmpty()) {
            mo36022k(str, str2);
            return;
        }
        if (h.size() == 1) {
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", h.get(0));
            intent.setType((list2.isEmpty() || list2.get(0) == null) ? "*/*" : list2.get(0));
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", h);
            intent.setType(m57128i(list2));
        }
        if (str != null) {
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        if (str2 != null) {
            intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str2);
        }
        intent.addFlags(1);
        Intent createChooser = Intent.createChooser(intent, (CharSequence) null);
        for (ResolveInfo resolveInfo : m57124e().getPackageManager().queryIntentActivities(createChooser, 65536)) {
            String str3 = resolveInfo.activityInfo.packageName;
            Iterator<Uri> it = h.iterator();
            while (it.hasNext()) {
                m57124e().grantUriPermission(str3, it.next(), 3);
            }
        }
        m57129m(createChooser);
    }
}
