package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.C0651l;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p124r.C5415b;

/* renamed from: androidx.core.app.m */
/* compiled from: NotificationCompatBuilder */
class C0663m implements C0650k {

    /* renamed from: a */
    private final Context f2147a;

    /* renamed from: b */
    private final Notification.Builder f2148b;

    /* renamed from: c */
    private final C0651l.C0659e f2149c;

    /* renamed from: d */
    private RemoteViews f2150d;

    /* renamed from: e */
    private RemoteViews f2151e;

    /* renamed from: f */
    private final List<Bundle> f2152f = new ArrayList();

    /* renamed from: g */
    private final Bundle f2153g = new Bundle();

    /* renamed from: h */
    private int f2154h;

    /* renamed from: i */
    private RemoteViews f2155i;

    C0663m(C0651l.C0659e eVar) {
        int i;
        Icon icon;
        List<String> list;
        List<String> e;
        this.f2149c = eVar;
        this.f2147a = eVar.f2116a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f2148b = new Notification.Builder(eVar.f2116a, eVar.f2104L);
        } else {
            this.f2148b = new Notification.Builder(eVar.f2116a);
        }
        Notification notification = eVar.f2112T;
        this.f2148b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f2124i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f2120e).setContentText(eVar.f2121f).setContentInfo(eVar.f2126k).setContentIntent(eVar.f2122g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f2123h, (notification.flags & 128) != 0).setLargeIcon(eVar.f2125j).setNumber(eVar.f2127l).setProgress(eVar.f2136u, eVar.f2137v, eVar.f2138w);
        if (i2 < 21) {
            this.f2148b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i2 >= 16) {
            this.f2148b.setSubText(eVar.f2133r).setUsesChronometer(eVar.f2130o).setPriority(eVar.f2128m);
            Iterator<C0651l.C0652a> it = eVar.f2117b.iterator();
            while (it.hasNext()) {
                m3080b(it.next());
            }
            Bundle bundle = eVar.f2097E;
            if (bundle != null) {
                this.f2153g.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (eVar.f2093A) {
                    this.f2153g.putBoolean("android.support.localOnly", true);
                }
                String str = eVar.f2139x;
                if (str != null) {
                    this.f2153g.putString("android.support.groupKey", str);
                    if (eVar.f2140y) {
                        this.f2153g.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f2153g.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = eVar.f2141z;
                if (str2 != null) {
                    this.f2153g.putString("android.support.sortKey", str2);
                }
            }
            this.f2150d = eVar.f2101I;
            this.f2151e = eVar.f2102J;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 17) {
            this.f2148b.setShowWhen(eVar.f2129n);
        }
        if (i3 >= 19 && i3 < 21 && (e = m3081e(m3082g(eVar.f2118c), eVar.f2115W)) != null && !e.isEmpty()) {
            this.f2153g.putStringArray("android.people", (String[]) e.toArray(new String[e.size()]));
        }
        if (i3 >= 20) {
            this.f2148b.setLocalOnly(eVar.f2093A).setGroup(eVar.f2139x).setGroupSummary(eVar.f2140y).setSortKey(eVar.f2141z);
            this.f2154h = eVar.f2108P;
        }
        if (i3 >= 21) {
            this.f2148b.setCategory(eVar.f2096D).setColor(eVar.f2098F).setVisibility(eVar.f2099G).setPublicVersion(eVar.f2100H).setSound(notification.sound, notification.audioAttributes);
            if (i3 < 28) {
                list = m3081e(m3082g(eVar.f2118c), eVar.f2115W);
            } else {
                list = eVar.f2115W;
            }
            if (list != null && !list.isEmpty()) {
                for (String addPerson : list) {
                    this.f2148b.addPerson(addPerson);
                }
            }
            this.f2155i = eVar.f2103K;
            if (eVar.f2119d.size() > 0) {
                Bundle bundle2 = eVar.mo2935f().getBundle("android.car.EXTENSIONS");
                bundle2 = bundle2 == null ? new Bundle() : bundle2;
                Bundle bundle3 = new Bundle(bundle2);
                Bundle bundle4 = new Bundle();
                for (int i4 = 0; i4 < eVar.f2119d.size(); i4++) {
                    bundle4.putBundle(Integer.toString(i4), C0664n.m3089b(eVar.f2119d.get(i4)));
                }
                bundle2.putBundle("invisible_actions", bundle4);
                bundle3.putBundle("invisible_actions", bundle4);
                eVar.mo2935f().putBundle("android.car.EXTENSIONS", bundle2);
                this.f2153g.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23 && (icon = eVar.f2114V) != null) {
            this.f2148b.setSmallIcon(icon);
        }
        if (i5 >= 24) {
            this.f2148b.setExtras(eVar.f2097E).setRemoteInputHistory(eVar.f2135t);
            RemoteViews remoteViews = eVar.f2101I;
            if (remoteViews != null) {
                this.f2148b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f2102J;
            if (remoteViews2 != null) {
                this.f2148b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f2103K;
            if (remoteViews3 != null) {
                this.f2148b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i5 >= 26) {
            this.f2148b.setBadgeIconType(eVar.f2105M).setSettingsText(eVar.f2134s).setShortcutId(eVar.f2106N).setTimeoutAfter(eVar.f2107O).setGroupAlertBehavior(eVar.f2108P);
            if (eVar.f2095C) {
                this.f2148b.setColorized(eVar.f2094B);
            }
            if (!TextUtils.isEmpty(eVar.f2104L)) {
                this.f2148b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i5 >= 28) {
            Iterator<C0672p> it2 = eVar.f2118c.iterator();
            while (it2.hasNext()) {
                this.f2148b.addPerson(it2.next().mo2985h());
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            this.f2148b.setAllowSystemGeneratedContextualActions(eVar.f2110R);
            this.f2148b.setBubbleMetadata(C0651l.C0658d.m3022a(eVar.f2111S));
        }
        if (i6 >= 31 && (i = eVar.f2109Q) != 0) {
            this.f2148b.setForegroundServiceBehavior(i);
        }
        if (eVar.f2113U) {
            if (this.f2149c.f2140y) {
                this.f2154h = 2;
            } else {
                this.f2154h = 1;
            }
            this.f2148b.setVibrate((long[]) null);
            this.f2148b.setSound((Uri) null);
            int i7 = notification.defaults & -2;
            notification.defaults = i7;
            int i8 = i7 & -3;
            notification.defaults = i8;
            this.f2148b.setDefaults(i8);
            if (i6 >= 26) {
                if (TextUtils.isEmpty(this.f2149c.f2139x)) {
                    this.f2148b.setGroup("silent");
                }
                this.f2148b.setGroupAlertBehavior(this.f2154h);
            }
        }
    }

    /* renamed from: b */
    private void m3080b(C0651l.C0652a aVar) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            IconCompat f = aVar.mo2902f();
            if (i >= 23) {
                builder = new Notification.Action.Builder(f != null ? f.mo3068x() : null, aVar.mo2906j(), aVar.mo2897a());
            } else {
                builder = new Notification.Action.Builder(f != null ? f.mo3061p() : 0, aVar.mo2906j(), aVar.mo2897a());
            }
            if (aVar.mo2903g() != null) {
                for (RemoteInput addRemoteInput : C0676r.m3135b(aVar.mo2903g())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (aVar.mo2900d() != null) {
                bundle = new Bundle(aVar.mo2900d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo2898b());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                builder.setAllowGeneratedReplies(aVar.mo2898b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.mo2904h());
            if (i2 >= 28) {
                builder.setSemanticAction(aVar.mo2904h());
            }
            if (i2 >= 29) {
                builder.setContextual(aVar.mo2908l());
            }
            if (i2 >= 31) {
                builder.setAuthenticationRequired(aVar.mo2907k());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.mo2905i());
            builder.addExtras(bundle);
            this.f2148b.addAction(builder.build());
        } else if (i >= 16) {
            this.f2152f.add(C0664n.m3093f(this.f2148b, aVar));
        }
    }

    /* renamed from: e */
    private static List<String> m3081e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C5415b bVar = new C5415b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    /* renamed from: g */
    private static List<String> m3082g(List<C0672p> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C0672p g : list) {
            arrayList.add(g.mo2984g());
        }
        return arrayList;
    }

    /* renamed from: h */
    private void m3083h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & -2;
        notification.defaults = i;
        notification.defaults = i & -3;
    }

    /* renamed from: a */
    public Notification.Builder mo2896a() {
        return this.f2148b;
    }

    /* renamed from: c */
    public Notification mo2962c() {
        Bundle a;
        RemoteViews k;
        RemoteViews i;
        C0651l.C0662h hVar = this.f2149c.f2132q;
        if (hVar != null) {
            hVar.mo2909b(this);
        }
        RemoteViews j = hVar != null ? hVar.mo2959j(this) : null;
        Notification d = mo2963d();
        if (j != null) {
            d.contentView = j;
        } else {
            RemoteViews remoteViews = this.f2149c.f2101I;
            if (remoteViews != null) {
                d.contentView = remoteViews;
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (!(i2 < 16 || hVar == null || (i = hVar.mo2958i(this)) == null)) {
            d.bigContentView = i;
        }
        if (!(i2 < 21 || hVar == null || (k = this.f2149c.f2132q.mo2960k(this)) == null)) {
            d.headsUpContentView = k;
        }
        if (!(i2 < 16 || hVar == null || (a = C0651l.m2993a(d)) == null)) {
            hVar.mo2914a(a);
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Notification mo2963d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f2148b.build();
        }
        if (i >= 24) {
            Notification build = this.f2148b.build();
            if (this.f2154h != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f2154h != 2)) {
                    m3083h(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f2154h == 1) {
                    m3083h(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f2148b.setExtras(this.f2153g);
            Notification build2 = this.f2148b.build();
            RemoteViews remoteViews = this.f2150d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f2151e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f2155i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f2154h != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f2154h != 2)) {
                    m3083h(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f2154h == 1) {
                    m3083h(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f2148b.setExtras(this.f2153g);
            Notification build3 = this.f2148b.build();
            RemoteViews remoteViews4 = this.f2150d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f2151e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f2154h != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f2154h != 2)) {
                    m3083h(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f2154h == 1) {
                    m3083h(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> a = C0664n.m3088a(this.f2152f);
            if (a != null) {
                this.f2153g.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f2148b.setExtras(this.f2153g);
            Notification build4 = this.f2148b.build();
            RemoteViews remoteViews6 = this.f2150d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f2151e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.f2148b.getNotification();
        } else {
            Notification build5 = this.f2148b.build();
            Bundle a2 = C0651l.m2993a(build5);
            Bundle bundle = new Bundle(this.f2153g);
            for (String str : this.f2153g.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray<Bundle> a3 = C0664n.m3088a(this.f2152f);
            if (a3 != null) {
                C0651l.m2993a(build5).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            RemoteViews remoteViews8 = this.f2150d;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f2151e;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Context mo2964f() {
        return this.f2147a;
    }
}
