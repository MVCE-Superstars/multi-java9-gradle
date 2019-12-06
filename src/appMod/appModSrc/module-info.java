module appMod {
    exports appPack to coreMod;
    requires greetMod;
    requires coreMod;
}
