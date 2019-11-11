/*
 * Copyright 2019 Lawrence Kesteloot
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.teamten.trs80;

/**
 * Information about one particular bit (its position and status).
 */
class BitData {
    public final int mStartFrame;
    public final int mEndFrame;
    public final BitType mBitType;

    /**
     * Create an object representing a bit.
     *
     * @param startFrame the first frame, inclusive.
     * @param endFrame the last frame, inclusive.
     * @param bitType what kind of bit it is.
     */
    public BitData(int startFrame, int endFrame, BitType bitType) {
        mStartFrame = startFrame;
        mEndFrame = endFrame;
        mBitType = bitType;
    }

    public int getStartFrame() {
        return mStartFrame;
    }

    public int getEndFrame() {
        return mEndFrame;
    }

    public BitType getBitType() {
        return mBitType;
    }
}
