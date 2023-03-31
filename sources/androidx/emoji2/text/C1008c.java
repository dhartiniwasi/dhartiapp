package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.core.provider.C0788e;
import androidx.core.util.C0831h;
import androidx.emoji2.text.C1014e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.emoji2.text.c */
/* compiled from: DefaultEmojiCompatConfig */
public final class C1008c {

    /* renamed from: androidx.emoji2.text.c$a */
    /* compiled from: DefaultEmojiCompatConfig */
    public static class C1009a {

        /* renamed from: a */
        private final C1010b f2714a;

        public C1009a(C1010b bVar) {
            this.f2714a = bVar == null ? m4530e() : bVar;
        }

        /* renamed from: a */
        private C1014e.C1018c m4527a(Context context, C0788e eVar) {
            if (eVar == null) {
                return null;
            }
            return new C1031j(context, eVar);
        }

        /* renamed from: b */
        private List<List<byte[]>> m4528b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        /* renamed from: d */
        private C0788e m4529d(ProviderInfo providerInfo, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new C0788e(str, str2, "emojicompat-emoji-font", m4528b(this.f2714a.mo3624b(packageManager, str2)));
        }

        /* renamed from: e */
        private static C1010b m4530e() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                return new C1012d();
            }
            if (i >= 19) {
                return new C1011c();
            }
            return new C1010b();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r2 = r2.applicationInfo;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m4531f(android.content.pm.ProviderInfo r2) {
            /*
                r1 = this;
                r0 = 1
                if (r2 == 0) goto L_0x000d
                android.content.pm.ApplicationInfo r2 = r2.applicationInfo
                if (r2 == 0) goto L_0x000d
                int r2 = r2.flags
                r2 = r2 & r0
                if (r2 != r0) goto L_0x000d
                goto L_0x000e
            L_0x000d:
                r0 = 0
            L_0x000e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C1008c.C1009a.m4531f(android.content.pm.ProviderInfo):boolean");
        }

        /* renamed from: g */
        private ProviderInfo m4532g(PackageManager packageManager) {
            for (ResolveInfo a : this.f2714a.mo3625c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0)) {
                ProviderInfo a2 = this.f2714a.mo3623a(a);
                if (m4531f(a2)) {
                    return a2;
                }
            }
            return null;
        }

        /* renamed from: c */
        public C1014e.C1018c mo3621c(Context context) {
            return m4527a(context, mo3622h(context));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C0788e mo3622h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            C0831h.m3663g(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g = m4532g(packageManager);
            if (g == null) {
                return null;
            }
            try {
                return m4529d(g, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.c$b */
    /* compiled from: DefaultEmojiCompatConfig */
    public static class C1010b {
        /* renamed from: a */
        public ProviderInfo mo3623a(ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        /* renamed from: b */
        public Signature[] mo3624b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        /* renamed from: c */
        public List<ResolveInfo> mo3625c(PackageManager packageManager, Intent intent, int i) {
            return Collections.emptyList();
        }
    }

    /* renamed from: androidx.emoji2.text.c$c */
    /* compiled from: DefaultEmojiCompatConfig */
    public static class C1011c extends C1010b {
        /* renamed from: a */
        public ProviderInfo mo3623a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        /* renamed from: c */
        public List<ResolveInfo> mo3625c(PackageManager packageManager, Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    /* renamed from: androidx.emoji2.text.c$d */
    /* compiled from: DefaultEmojiCompatConfig */
    public static class C1012d extends C1011c {
        /* renamed from: b */
        public Signature[] mo3624b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* renamed from: a */
    public static C1031j m4526a(Context context) {
        return (C1031j) new C1009a((C1010b) null).mo3621c(context);
    }
}
