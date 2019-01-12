package com.bank.checker.bankchecker;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateSerializer {} /*extends StdSerializer<LocalDate> {

        private static DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        public LocalDateSerializer() {
            this(null);
        }

        public LocalDateSerializer(Class<LocalDate> t) {
            super(t);
        }

        @Override
        public void serialize(
                LocalDate localDate,
                JsonGenerator gen,
                SerializerProvider arg2)
                throws IOException, JsonProcessingException {
            localDate.i
            gen.writeString(formatter.format(value));
        }

}*/
