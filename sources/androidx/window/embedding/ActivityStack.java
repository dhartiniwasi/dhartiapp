package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;

@ExperimentalWindowApi
/* compiled from: ActivityStack.kt */
public final class ActivityStack {
    private final List<Activity> activities;
    private final boolean isEmpty;

    public ActivityStack(List<? extends Activity> list, boolean z) {
        C11669k.m56787e(list, "activities");
        this.activities = list;
        this.isEmpty = z;
    }

    public final boolean contains(Activity activity) {
        C11669k.m56787e(activity, "activity");
        return this.activities.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityStack)) {
            return false;
        }
        ActivityStack activityStack = (ActivityStack) obj;
        if (C11669k.m56783a(this.activities, activityStack.activities) || this.isEmpty == activityStack.isEmpty) {
            return false;
        }
        return true;
    }

    public final List<Activity> getActivities$window_release() {
        return this.activities;
    }

    public int hashCode() {
        return ((this.isEmpty ? 1 : 0) * true) + this.activities.hashCode();
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityStack{");
        sb.append(C11669k.m56792j("activities=", getActivities$window_release()));
        sb.append("isEmpty=" + this.isEmpty + '}');
        String sb2 = sb.toString();
        C11669k.m56786d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActivityStack(List list, boolean z, int i, C11665g gVar) {
        this(list, (i & 2) != 0 ? false : z);
    }
}
