package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class i13 {

    /* renamed from: a */
    private final HashMap f10580a = new HashMap();

    /* renamed from: b */
    private final HashMap f10581b = new HashMap();

    /* renamed from: c */
    private final HashMap f10582c = new HashMap();

    /* renamed from: d */
    private final HashSet f10583d = new HashSet();

    /* renamed from: e */
    private final HashSet f10584e = new HashSet();

    /* renamed from: f */
    private final HashSet f10585f = new HashSet();

    /* renamed from: g */
    private final HashMap f10586g = new HashMap();

    /* renamed from: h */
    private final Map f10587h = new WeakHashMap();

    /* renamed from: i */
    private boolean f10588i;

    /* renamed from: a */
    public final View mo10988a(String str) {
        return (View) this.f10582c.get(str);
    }

    /* renamed from: b */
    public final h13 mo10989b(View view) {
        h13 h13 = (h13) this.f10581b.get(view);
        if (h13 != null) {
            this.f10581b.remove(view);
        }
        return h13;
    }

    /* renamed from: c */
    public final String mo10990c(String str) {
        return (String) this.f10586g.get(str);
    }

    /* renamed from: d */
    public final String mo10991d(View view) {
        if (this.f10580a.size() == 0) {
            return null;
        }
        String str = (String) this.f10580a.get(view);
        if (str != null) {
            this.f10580a.remove(view);
        }
        return str;
    }

    /* renamed from: e */
    public final HashSet mo10992e() {
        return this.f10585f;
    }

    /* renamed from: f */
    public final HashSet mo10993f() {
        return this.f10584e;
    }

    /* renamed from: g */
    public final void mo10994g() {
        this.f10580a.clear();
        this.f10581b.clear();
        this.f10582c.clear();
        this.f10583d.clear();
        this.f10584e.clear();
        this.f10585f.clear();
        this.f10586g.clear();
        this.f10588i = false;
    }

    /* renamed from: h */
    public final void mo10995h() {
        this.f10588i = true;
    }

    /* renamed from: i */
    public final void mo10996i() {
        Boolean bool;
        m03 a = m03.m16344a();
        if (a != null) {
            for (a03 a03 : a.mo12244b()) {
                View f = a03.mo8161f();
                if (a03.mo8165j()) {
                    String h = a03.mo8163h();
                    if (f != null) {
                        String str = null;
                        if (!f.isAttachedToWindow()) {
                            str = "notAttached";
                        } else {
                            if (f.hasWindowFocus()) {
                                this.f10587h.remove(f);
                                bool = Boolean.FALSE;
                            } else if (this.f10587h.containsKey(f)) {
                                bool = (Boolean) this.f10587h.get(f);
                            } else {
                                Map map = this.f10587h;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(f, bool2);
                                bool = bool2;
                            }
                            if (bool.booleanValue()) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = f;
                                while (true) {
                                    if (view == null) {
                                        this.f10583d.addAll(hashSet);
                                        break;
                                    }
                                    String b = f13.m12399b(view);
                                    if (b != null) {
                                        str = b;
                                        break;
                                    }
                                    hashSet.add(view);
                                    ViewParent parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            }
                        }
                        if (str == null) {
                            this.f10584e.add(h);
                            this.f10580a.put(f, h);
                            for (o03 o03 : a03.mo8164i()) {
                                View view2 = (View) o03.mo12777b().get();
                                if (view2 != null) {
                                    h13 h13 = (h13) this.f10581b.get(view2);
                                    if (h13 != null) {
                                        h13.mo10715c(a03.mo8163h());
                                    } else {
                                        this.f10581b.put(view2, new h13(o03, a03.mo8163h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f10585f.add(h);
                            this.f10582c.put(h, f);
                            this.f10586g.put(h, str);
                        }
                    } else {
                        this.f10585f.add(h);
                        this.f10586g.put(h, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public final boolean mo10997j(View view) {
        if (!this.f10587h.containsKey(view)) {
            return true;
        }
        this.f10587h.put(view, Boolean.TRUE);
        return false;
    }

    /* renamed from: k */
    public final int mo10998k(View view) {
        if (this.f10583d.contains(view)) {
            return 1;
        }
        return this.f10588i ? 2 : 3;
    }
}
