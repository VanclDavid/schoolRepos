package com.CMD;

public class Main {

    public static void main(String[] args) {
        CMD cmd = new CMD("I:\\Java_workspace\\ExercisesSchool");
        cmd.cd("..");
        cmd.cd("DiscordBots");
        cmd.dir();
//        cmd.createFolder("TEST");
        cmd.help();
    }
}
