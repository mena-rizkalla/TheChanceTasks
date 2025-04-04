package org.example.weekOne

class IPv4Checker {

    fun IPv4Checker(ipv4 : String) : Boolean {

        if(ipv4.isEmpty())
            return false
        // 0-255
        val ipv4StringParts = ipv4.split(".")

        if(ipv4StringParts.size != 4) {
            return false
        }

        for(octet in ipv4StringParts){

            if(octet.isEmpty() || octet.length > 3)
                return false

            if(octet.length > 1 && octet[0] == '0')
                return false

            try {
                val num = octet.toInt()
                if (num < 0 || num > 255) {
                    return false
                }
            } catch (e: NumberFormatException) {
                return false // Not a valid integer
            }
        }
        return true
    }
}