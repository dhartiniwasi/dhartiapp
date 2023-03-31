package com.startapp.sdk.triggeredlinks;

import android.app.Activity;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class TriggeredLinksMetadata implements Serializable {
    private static final long serialVersionUID = 1082253451843108611L;
    @C9226pb(complex = true, name = "AppEvents")
    private AppEventsMetadata appEvents;
    private boolean enabled = true;
    private int ief;
    private int smartRedirectTimeoutInSec = 10;
    @C9226pb(name = "ThrottlingPublisherIDs", type = ArrayList.class, value = Integer.class)
    private List<Integer> throttlingPublisherIDs;
    private boolean triggeredLinkInfoEvent = true;

    /* renamed from: a */
    public AppEventsMetadata mo31246a() {
        return this.appEvents;
    }

    /* renamed from: b */
    public int mo31247b() {
        return this.ief;
    }

    /* renamed from: c */
    public int mo31248c() {
        return this.smartRedirectTimeoutInSec;
    }

    /* renamed from: d */
    public List<Integer> mo31249d() {
        return this.throttlingPublisherIDs;
    }

    /* renamed from: e */
    public boolean mo31250e() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TriggeredLinksMetadata triggeredLinksMetadata = (TriggeredLinksMetadata) obj;
        if (this.enabled == triggeredLinksMetadata.enabled && this.smartRedirectTimeoutInSec == triggeredLinksMetadata.smartRedirectTimeoutInSec && this.triggeredLinkInfoEvent == triggeredLinksMetadata.triggeredLinkInfoEvent && this.ief == triggeredLinksMetadata.ief && C9605vb.m50465a(this.appEvents, triggeredLinksMetadata.appEvents) && C9605vb.m50465a(this.throttlingPublisherIDs, triggeredLinksMetadata.throttlingPublisherIDs)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo31252f() {
        return this.triggeredLinkInfoEvent;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Integer.valueOf(this.smartRedirectTimeoutInSec), Boolean.valueOf(this.triggeredLinkInfoEvent), this.appEvents, this.throttlingPublisherIDs, Integer.valueOf(this.ief)};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
