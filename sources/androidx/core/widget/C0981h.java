package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.ListView;

/* renamed from: androidx.core.widget.h */
/* compiled from: ListViewCompat */
public final class C0981h {

    /* renamed from: androidx.core.widget.h$a */
    /* compiled from: ListViewCompat */
    static class C0982a {
        /* renamed from: a */
        static boolean m4442a(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        /* renamed from: b */
        static void m4443b(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    /* renamed from: a */
    public static boolean m4440a(ListView listView, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0982a.m4442a(listView, i);
        }
        int childCount = listView.getChildCount();
        if (childCount == 0) {
            return false;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (i > 0) {
            int bottom = listView.getChildAt(childCount - 1).getBottom();
            if (firstVisiblePosition + childCount < listView.getCount() || bottom > listView.getHeight() - listView.getListPaddingBottom()) {
                return true;
            }
            return false;
        }
        int top = listView.getChildAt(0).getTop();
        if (firstVisiblePosition > 0 || top < listView.getListPaddingTop()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m4441b(ListView listView, int i) {
        View childAt;
        if (Build.VERSION.SDK_INT >= 19) {
            C0982a.m4443b(listView, i);
            return;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition != -1 && (childAt = listView.getChildAt(0)) != null) {
            listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
        }
    }
}
