package tech.zhangzy.creation.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 组装电脑
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/09/10
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Computer {
    private String cpu;

    private String gpu;

    private String keyboard;

    private String soundCard;

    private String crate;

    public static class ComputerBuilder {

        private String cpu;

        private String gpu;

        private String keyboard;

        private String soundCard;

        private String crate;

        public ComputerBuilder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public ComputerBuilder keyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public ComputerBuilder soundCard(String soundCard) {
            this.soundCard = soundCard;
            return this;
        }

        public ComputerBuilder crate(String crate) {
            this.crate = crate;
            return this;
        }

        public Computer build(){
            Computer computer = new Computer();
            computer.setCpu(this.cpu);
            computer.setGpu(this.gpu);
            computer.setKeyboard(this.keyboard);
            computer.setSoundCard(this.soundCard);
            computer.setCrate(this.crate);
            return computer;
        }
    }
}
