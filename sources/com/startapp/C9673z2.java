package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.startapp.z2 */
/* compiled from: Sta */
public class C9673z2 {

    /* renamed from: com.startapp.z2$a */
    /* compiled from: Sta */
    public class C9674a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f39543a;

        /* renamed from: b */
        public final /* synthetic */ String f39544b;

        /* renamed from: c */
        public final /* synthetic */ Serializable f39545c;

        public C9674a(Context context, String str, Serializable serializable) {
            this.f39543a = context;
            this.f39544b = str;
            this.f39545c = serializable;
        }

        public void run() {
            Context context = this.f39543a;
            String str = this.f39544b;
            Serializable serializable = this.f39545c;
            if (str != null) {
                try {
                    C9673z2.m50593a(C9673z2.m50597c(context, (String) null), str, serializable);
                } catch (Throwable th) {
                    if (C9673z2.m50594a(4)) {
                        C9023i4.m48681a(th);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m50591a(Context context, String str, Serializable serializable) {
        try {
            m50593a(m50597c(context, (String) null), str, serializable);
        } catch (Throwable th) {
            if (m50594a(4)) {
                C9023i4.m48681a(th);
            }
        }
    }

    /* renamed from: b */
    public static void m50596b(Context context, String str, Serializable serializable) {
        try {
            ComponentLocator.m50248a(context).mo31173i().execute(new C9674a(context, str, serializable));
        } catch (Throwable th) {
            if (m50594a(1)) {
                C9023i4.m48681a(th);
            }
        }
    }

    /* renamed from: c */
    public static String m50597c(Context context, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().toString());
        if (str != null) {
            str2 = File.separator + str;
        } else {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: d */
    public static <T> List m50598d(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(m50595b(context, str));
            if (file.exists()) {
                if (file.isDirectory()) {
                    String[] list = file.list();
                    if (list == null) {
                        return null;
                    }
                    for (String file2 : list) {
                        FileInputStream fileInputStream = new FileInputStream(new File(file, file2));
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                        Object readObject = objectInputStream.readObject();
                        objectInputStream.close();
                        fileInputStream.close();
                        arrayList.add(readObject);
                    }
                    return arrayList;
                }
            }
            return null;
        } catch (Throwable th) {
            if (m50594a(2)) {
                C9023i4.m48681a(th);
            }
        }
    }

    /* renamed from: b */
    public static String m50595b(Context context, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().toString());
        if (str != null) {
            str2 = File.separator + str;
        } else {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static <T> T m50588a(Context context, String str, Class<T> cls) {
        try {
            return m50589a(m50597c(context, (String) null), str);
        } catch (Throwable th) {
            if (!m50594a(2)) {
                return null;
            }
            C9023i4.m48681a(th);
            return null;
        }
    }

    /* renamed from: a */
    public static void m50590a(Context context, String str) {
        if (str != null) {
            m50592a(new File(m50597c(context, str)));
            m50592a(new File(m50595b(context, str)));
        }
    }

    /* renamed from: a */
    public static void m50593a(String str, String str2, Serializable serializable) throws IOException {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, str2));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            fileOutputStream.close();
        }
    }

    /* renamed from: a */
    public static <T> T m50589a(String str, String str2) throws IOException, ClassNotFoundException {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return null;
        }
        File file2 = new File(file, str2);
        if (!file2.exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file2);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        T readObject = objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return readObject;
    }

    /* renamed from: a */
    public static void m50592a(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File a : listFiles) {
                m50592a(a);
            }
        }
        file.delete();
    }

    /* renamed from: a */
    public static boolean m50594a(int i) {
        try {
            AnalyticsConfig analyticsConfig = MetaData.f38952k.analytics;
            if (analyticsConfig == null || (analyticsConfig.mo30943e() & i) != i) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
