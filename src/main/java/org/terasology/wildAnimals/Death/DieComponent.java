/*
 * Copyright 2017 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.wildAnimals.Death;

import com.google.common.collect.Lists;
import org.terasology.entitySystem.Component;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.rendering.assets.animation.MeshAnimation;

import java.util.List;

public class DieComponent implements Component {
    /**
     * A pool of death animations. It gets currently only used by behavior trees to make a skeletal mesh perform an
     * animation while dying/falling. The animations of the pool will be played once.
     */
    public List<MeshAnimation> animationPool = Lists.newArrayList();
    public List<String> itemsDropped = Lists.newArrayList();
}