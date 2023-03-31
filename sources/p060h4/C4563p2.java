package p060h4;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.pm0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p122q4.C5399a;

/* renamed from: h4.p2 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4563p2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final HashSet f24930a = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Bundle f24931b = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final HashMap f24932c = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final HashSet f24933d = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Bundle f24934e = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final HashSet f24935f = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Date f24936g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f24937h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final List f24938i = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f24939j = -1;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f24940k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f24941l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f24942m = -1;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f24943n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C5399a f24944o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f24945p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f24946q = 60000;

    /* renamed from: A */
    public final void mo18090A(String str, String str2) {
        this.f24934e.putString(str, str2);
    }

    /* renamed from: B */
    public final void mo18091B(String str) {
        this.f24930a.add(str);
    }

    /* renamed from: C */
    public final void mo18092C(Class cls, Bundle bundle) {
        this.f24931b.putBundle(cls.getName(), bundle);
    }

    /* renamed from: D */
    public final void mo18093D(String str) {
        this.f24933d.add(str);
    }

    /* renamed from: E */
    public final void mo18094E(String str) {
        this.f24933d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    /* renamed from: F */
    public final void mo18095F(C5399a aVar) {
        this.f24944o = aVar;
    }

    @Deprecated
    /* renamed from: a */
    public final void mo18096a(Date date) {
        this.f24936g = date;
    }

    /* renamed from: b */
    public final void mo18097b(String str) {
        this.f24937h = str;
    }

    @Deprecated
    /* renamed from: c */
    public final void mo18098c(int i) {
        this.f24939j = i;
    }

    /* renamed from: d */
    public final void mo18099d(int i) {
        this.f24946q = i;
    }

    @Deprecated
    /* renamed from: e */
    public final void mo18100e(boolean z) {
        this.f24943n = z;
    }

    /* renamed from: f */
    public final void mo18101f(List list) {
        this.f24938i.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                pm0.m18667g("neighboring content URL should not be null or empty");
            } else {
                this.f24938i.add(str);
            }
        }
    }

    /* renamed from: g */
    public final void mo18102g(String str) {
        this.f24940k = str;
    }

    /* renamed from: h */
    public final void mo18103h(String str) {
        this.f24941l = str;
    }

    @Deprecated
    /* renamed from: i */
    public final void mo18104i(boolean z) {
        this.f24942m = z ? 1 : 0;
    }
}
