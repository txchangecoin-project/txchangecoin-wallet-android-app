package io.wookey.wallet.support

import io.wookey.wallet.data.entity.Coin
import io.wookey.wallet.data.entity.Node

const val WALLET_RECOVERY = 1
const val WALLET_CREATE = 0

const val TRANSFER_ALL = 0
const val TRANSFER_IN = 1
const val TRANSFER_OUT = 2

const val SELECT_ADDRESS = 1

const val REQUEST_SCAN_ADDRESS = 100
const val REQUEST_SELECT_COIN = 101
const val REQUEST_SELECT_ADDRESS = 102
const val REQUEST_SELECT_NODE = 103

const val REQUEST_CODE_PERMISSION_CAMERA = 501

const val ZH_CN = "zh-CN"
const val EN = "en"

val coinList = listOf(
        Coin("XMR", "Monero")
)

val nodeArray = arrayOf(
        Node().apply {
            symbol = "XMR"
            url = "node.moneroworld.com:18089"
            isSelected = true
        },
        Node().apply {
            symbol = "XMR"
            url = "opennode.xmr-tw.org:18089"
            isSelected = false
        },
        Node().apply {
            symbol = "XMR"
            url = "uwillrunanodesoon.moneroworld.com:18089"
            isSelected = false
        },
        Node().apply {
            symbol = "XMR"
            url = "124.160.224.28:18081"
            isSelected = false
        }
)
