package com.startapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import com.startapp.sdk.ads.list3d.List3DActivity;
import com.startapp.sdk.ads.list3d.List3DView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.startapp.g4 */
/* compiled from: Sta */
public class C8968g4 {

    /* renamed from: a */
    public HashMap<String, C9087k9> f36812a = new HashMap<>();

    /* renamed from: b */
    public Hashtable<String, Bitmap> f36813b = new Hashtable<>();

    /* renamed from: c */
    public Set<String> f36814c = new HashSet();

    /* renamed from: d */
    public C9279s7 f36815d;

    /* renamed from: e */
    public int f36816e = 0;

    /* renamed from: f */
    public ConcurrentLinkedQueue<C8970b> f36817f = new ConcurrentLinkedQueue<>();

    /* renamed from: com.startapp.g4$a */
    /* compiled from: Sta */
    public class C8969a extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a */
        public int f36818a = -1;

        /* renamed from: b */
        public String f36819b;

        /* renamed from: c */
        public String f36820c;

        public C8969a(int i, String str, String str2) {
            this.f36818a = i;
            this.f36819b = str;
            this.f36820c = str2;
        }

        public Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            return C8993h1.m48655b(this.f36820c);
        }

        public void onPostExecute(Object obj) {
            List<C9637x5> list;
            Bitmap bitmap = (Bitmap) obj;
            C8968g4 g4Var = C8968g4.this;
            boolean z = true;
            g4Var.f36816e--;
            if (bitmap != null) {
                g4Var.f36813b.put(this.f36819b, bitmap);
                C9279s7 s7Var = C8968g4.this.f36815d;
                if (s7Var != null) {
                    int i = this.f36818a;
                    List3DActivity list3DActivity = (List3DActivity) s7Var;
                    List3DView list3DView = list3DActivity.f38321a;
                    View childAt = list3DView.getChildAt(i - list3DView.f38343i);
                    if (childAt != null) {
                        C9656y5 y5Var = (C9656y5) childAt.getTag();
                        C9677z5 a = C8823a6.f36412b.mo29085a(list3DActivity.f38326f);
                        if (!(a == null || (list = a.f39553b) == null || i >= list.size())) {
                            C9637x5 x5Var = a.f39553b.get(i);
                            y5Var.f39439b.setImageBitmap(a.f39552a.mo29385a(i, x5Var.f39368a, x5Var.f39376i));
                            y5Var.f39439b.requestLayout();
                            if (x5Var.f39381n == null) {
                                z = false;
                            }
                            y5Var.mo31489a(z);
                        }
                    }
                }
                C8968g4 g4Var2 = C8968g4.this;
                if (!g4Var2.f36817f.isEmpty()) {
                    C8970b poll = g4Var2.f36817f.poll();
                    new C8969a(poll.f36822a, poll.f36823b, poll.f36824c).execute(new Void[0]);
                }
            }
        }
    }

    /* renamed from: com.startapp.g4$b */
    /* compiled from: Sta */
    public class C8970b {

        /* renamed from: a */
        public int f36822a;

        /* renamed from: b */
        public String f36823b;

        /* renamed from: c */
        public String f36824c;

        public C8970b(C8968g4 g4Var, int i, String str, String str2) {
            this.f36822a = i;
            this.f36823b = str;
            this.f36824c = str2;
        }
    }

    /* renamed from: a */
    public final String mo29386a(String[] strArr, String str) {
        if (strArr == null) {
            return null;
        }
        return TextUtils.join("^", strArr) + str;
    }

    /* renamed from: a */
    public Bitmap mo29385a(int i, String str, String str2) {
        Bitmap bitmap = this.f36813b.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        if (this.f36814c.contains(str)) {
            return null;
        }
        this.f36814c.add(str);
        int i2 = this.f36816e;
        if (i2 >= 15) {
            this.f36817f.add(new C8970b(this, i, str, str2));
            return null;
        }
        this.f36816e = i2 + 1;
        new C8969a(i, str, str2).execute(new Void[0]);
        return null;
    }
}
