/*
 * Copyright 2019-2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AFFERO GENERAL PUBLIC LICENSE version 3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

package net.mamoe.mirai.console.internal.command

import net.mamoe.mirai.console.data.AutoSavePluginConfig
import net.mamoe.mirai.console.data.ValueDescription
import net.mamoe.mirai.console.data.ValueName
import net.mamoe.mirai.console.data.value

@ValueDescription("""
    内置指令系统配置
""")
internal object CommandConfig : AutoSavePluginConfig("Command") {
    override fun shouldPerformAutoSaveWheneverChanged(): Boolean {
        return false
    }

    @ValueDescription("""
        指令前缀, 默认 "/"
    """)
    @ValueName("commandPrefix")
    val commandPrefix: String by value("/")
}