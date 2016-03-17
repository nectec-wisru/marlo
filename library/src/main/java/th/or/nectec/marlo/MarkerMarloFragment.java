/*
 * Copyright (c) 2016 NECTEC
 *   National Electronics and Computer Technology Center, Thailand
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package th.or.nectec.marlo;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MarkerMarloFragment extends MarloFragment {

    private Marker marker;

    @Override
    protected void onViewfinderClick(LatLng viewfinderTarget) {
        SoundUtility.play(getContext(), R.raw.thumpsoundeffect);
        if (marker != null) {
            marker.remove();
        }
        marker = getGoogleMap().addMarker(new MarkerOptions()
                .position(viewfinderTarget)
                .draggable(true));
    }

    public Marker getMarker() {
        return marker;
    }
}